package com.example.animeapp.domain

class AnimeRemoveItemUseCase(private val repository: AnimeRepository) {
    fun addRemoveItem(animeItem: AnimeItem){
        repository.removeAnimeItem(animeItem)
    }
}