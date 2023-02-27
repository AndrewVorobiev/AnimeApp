package com.example.animeapp.domain

class AnimeGetItemUseCase(private val repository: AnimeRepository) {

    suspend fun addGetItem(animeItemId: Int): AnimeItem{
        return repository.getAnimeItem(animeItemId)
    }
}