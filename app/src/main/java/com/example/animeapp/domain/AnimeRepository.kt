package com.example.animeapp.domain

import androidx.lifecycle.LiveData

interface AnimeRepository {

    fun addAnimeItem(animeItem: AnimeItem)
    fun editAnimeItem(animeItem: AnimeItem)
    fun getAnimeItem(animeItemId: Int): AnimeItem
    fun getAnimeList(): LiveData<List<AnimeItem>>
    fun removeAnimeItem(animeItem: AnimeItem)


}