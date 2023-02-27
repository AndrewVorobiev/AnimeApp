package com.example.animeapp.domain

class AnimeAddItemUseCase(private val repository: AnimeRepository) {

    fun addAnimeItem(animeItem: AnimeItem){
        repository.addAnimeItem(animeItem)

    }

}