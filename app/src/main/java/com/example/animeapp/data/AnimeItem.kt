package com.example.animeapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "anime_db")
data class AnimeItem(

    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val image: String,
    val title: String,
    val titleRussian: String,
    val description: String,
    val year: Int
)
