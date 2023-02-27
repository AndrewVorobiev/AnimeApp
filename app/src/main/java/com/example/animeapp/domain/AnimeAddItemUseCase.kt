package com.example.animeapp.domain

class AnimeAddItemUseCase(private val repository: AnimeRepository) {

    suspend fun addAnimeItem(animeItem: AnimeItem){
        repository.addAnimeItem(animeItem)

    }

}