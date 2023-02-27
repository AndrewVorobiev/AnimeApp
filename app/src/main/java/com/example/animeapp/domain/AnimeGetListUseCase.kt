package com.example.animeapp.domain

import androidx.lifecycle.LiveData

class AnimeGetListUseCase(private val repository: AnimeRepository) {

    fun addGetList(): LiveData<List<AnimeItem>> {
        return repository.getAnimeList()
    }
}