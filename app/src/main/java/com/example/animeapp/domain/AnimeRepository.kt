package com.example.animeapp.domain

import androidx.lifecycle.LiveData

interface AnimeRepository {

    suspend fun addAnimeItem(animeItem: AnimeItem)
    suspend fun editAnimeItem(animeItem: AnimeItem)
    suspend fun getAnimeItem(animeItemId: Int): AnimeItem
    fun getAnimeList(): LiveData<List<AnimeItem>>
    suspend fun removeAnimeItem(animeItem: AnimeItem)


}