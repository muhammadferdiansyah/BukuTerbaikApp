package com.example.newsapp

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.newsapp.data.DataBook

    fun initBookHeadline(view : View, position: Int , context: Context) {
    val imgBookHeadline : ImageView = view.findViewById(R.id.img_headline)
    val tvTitleHeadline : TextView = view.findViewById(R.id.tv_title_headline)
    val tvDateTimeHeadline : TextView = view.findViewById(R.id.tv_date_headline)
    val tvDescHeadline : TextView = view.findViewById(R.id.tv_desc_headline)
    val tvAuthorHeadline : TextView = view.findViewById(R.id.tv_author_headline)

    imgBookHeadline.setImageResource(DataBook.photoHeadline[position])
    tvTitleHeadline.text = DataBook.titleHeadline[position]
    tvDescHeadline.text = DataBook.contentHeadline[position]
    tvDateTimeHeadline.text = DataBook.dateHeadline[position]
    tvAuthorHeadline.text = DataBook.authorHeadline[position]

    view.setOnClickListener{
        val intent = Intent(context, DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_DATA_TITLE, DataBook.titleHeadline[position])
        intent.putExtra(DetailActivity.EXTRA_DATA_DATE, DataBook.dateHeadline[position])
        intent.putExtra(DetailActivity.EXTRA_DATA_AUTHOR, DataBook.authorHeadline[position])
        intent.putExtra(DetailActivity.EXTRA_DATA_CONTENT, DataBook.contentHeadline[position])
        intent.putExtra(DetailActivity.EXTRA_DATA_IMAGE, DataBook.photoHeadline[position])
        context.startActivity(intent)
    }

}
