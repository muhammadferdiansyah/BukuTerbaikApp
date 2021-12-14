package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.newsapp.data.Book

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DATA_TITLE = "title"
        const val EXTRA_DATA_DATE = "date"
        const val EXTRA_DATA_AUTHOR = "author"
        const val EXTRA_DATA_CONTENT = "content"
        const val EXTRA_DATA_IMAGE = "image"
        const val EXTRA_OBJECT_BOOK = "book"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        setSupportActionBar(findViewById(R.id.toolbar_detail))
        supportActionBar?.apply {
            setDisplayShowHomeEnabled(true)
            setDisplayHomeAsUpEnabled(true)
            title = "Book Detail"
        }


        val tvTitleDetail = findViewById<TextView>(R.id.tv_title_detail)
        tvTitleDetail.text = intent.getStringExtra("title")

        val tvDateDetail = findViewById<TextView>(R.id.tv_date_detail)
        tvDateDetail.text = intent.getStringExtra("date")

        val tvAuthorDetail = findViewById<TextView>(R.id.tv_author_detail)
        tvAuthorDetail.text = intent.getStringExtra("author")

        val tvContentDetail = findViewById<TextView>(R.id.tv_content_detail)
        tvContentDetail.text = intent.getStringExtra("content")

        val tvImgDetail = findViewById<ImageView>(R.id.img_book_detail)
        tvImgDetail.setImageResource(
            intent.getIntExtra(
                "image",
                0
            )
        )

        val dataBook = intent.getParcelableExtra<Book>(EXTRA_OBJECT_BOOK)

        if (dataBook != null) {
            tvTitleDetail.text = dataBook.title
            tvAuthorDetail.text = dataBook.author
            tvContentDetail.text = dataBook.content
            dataBook?.let { findViewById<ImageView>(R.id.img_book_detail).setImageResource(it.photo) }
        } else {
            tvTitleDetail.text = intent.getStringExtra(EXTRA_DATA_TITLE)
            tvDateDetail.text = intent.getStringExtra(EXTRA_DATA_DATE)
            tvAuthorDetail.text = intent.getStringExtra(EXTRA_DATA_AUTHOR)
            tvContentDetail.text = intent.getStringExtra(EXTRA_DATA_CONTENT)
            tvImgDetail.setImageResource(intent.getIntExtra(EXTRA_DATA_IMAGE, 0))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}