package com.example.newsapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.data.DataBook
import com.example.newsapp.adapter.NewsAdapter
import com.example.newsapp.R
import com.example.newsapp.initBookHeadline

class PopularFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_recent, container, false)

        val rvHome = view.findViewById<RecyclerView>(R.id.rv_popular_book)
        rvHome.layoutManager = LinearLayoutManager(view.context)
        rvHome.adapter = NewsAdapter(DataBook.dataPopular)

        val booksHeadline = view.findViewById<View>(R.id.book_headline)
        initBookHeadline( booksHeadline ,2, view.context)

        return view
    }


}