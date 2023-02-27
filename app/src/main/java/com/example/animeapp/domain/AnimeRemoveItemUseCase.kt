package com.example.animeapp.domain

class AnimeRemoveItemUseCase(private val repository: AnimeRepository) {
    suspend fun removeAnimeItem(animeItem: AnimeItem){
        repository.removeAnimeItem(animeItem)
    }
}