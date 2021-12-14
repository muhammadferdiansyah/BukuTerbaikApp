package com.example.newsapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.newsapp.fragment.HomeFragment
import com.example.newsapp.fragment.RecentFragment
import com.example.newsapp.fragment.PopularFragment

class SectionPagerAdaptor(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> PopularFragment()
            2 -> RecentFragment()
            else -> HomeFragment()
        }
    }

}