package com.example.animeapp.domain

class AnimeEditItemUseCase(private val repository: AnimeRepository) {


    fun editAnimeItem(animeItem: AnimeItem){
        repository.editAnimeItem(animeItem)
    }
}