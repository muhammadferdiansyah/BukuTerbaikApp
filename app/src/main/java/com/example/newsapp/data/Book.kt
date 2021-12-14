package com.example.newsapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Book(
    val title: String,
    val content: String,
    val author: String,
    val photo: Int,
    val category: String
) : Parcelable
