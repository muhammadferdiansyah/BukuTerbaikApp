package com.example.newsapp

import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionPaperAdapter : FragmentStateAdapter(fa:FragmentActivity) : FragmentStateAdapter(fa)) {
    override fun getItemCount() = 3

    override fun create fragment(position: int): Fragment {
        return when (position)
    }
}
