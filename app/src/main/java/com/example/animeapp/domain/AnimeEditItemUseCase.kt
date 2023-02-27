package com.example.animeapp.domain

class AnimeEditItemUseCase(private val repository: AnimeRepository) {


    suspend fun editAnimeItem(animeItem: AnimeItem){
        repository.editAnimeItem(animeItem)
    }
}