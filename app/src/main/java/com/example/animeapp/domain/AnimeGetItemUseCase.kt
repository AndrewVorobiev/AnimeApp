package com.example.animeapp.domain

class AnimeGetItemUseCase(private val repository: AnimeRepository) {

    fun addGetItem(animeItemId: Int){
        repository.getAnimeItem(animeItemId)
    }
}