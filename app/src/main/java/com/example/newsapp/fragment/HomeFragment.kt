package com.example.newsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.data.DataBook
import com.example.newsapp.adapter.NewsAdapter
import com.example.newsapp.R
import com.example.newsapp.initBookHeadline



class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val rvHome = view.findViewById<RecyclerView>(R.id.rv_home)
        rvHome.layoutManager = LinearLayoutManager(view.context)
        rvHome.adapter = NewsAdapter(DataBook.dataHome)

        val bookHeadline = view.findViewById<View>(R.id.book_headline)
        initBookHeadline( bookHeadline ,0, view.context)

        return view
    }


}