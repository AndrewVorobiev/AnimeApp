package com.example.animeapp.domain

import android.media.Rating


data class AnimeItem(

    val id: Int,
    val image: String,
    val title: String,
    val titleRussian: String,
    val description: String,
    val year: Int,
    val rating: Int
)
