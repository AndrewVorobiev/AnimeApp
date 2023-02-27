package com.example.animeapp.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.animeapp.data.AnimeRepositoryImpl
import com.example.animeapp.domain.AnimeEditItemUseCase
import com.example.animeapp.domain.AnimeGetListUseCase
import com.example.animeapp.domain.AnimeItem
import com.example.animeapp.domain.AnimeRemoveItemUseCase
import kotlinx.coroutines.launch

class MainViewModel(application: Application): AndroidViewModel(application) {

    private val repository = AnimeRepositoryImpl(application)
    private val animeEditItemUseCase = AnimeEditItemUseCase(repository)
    private val animeGetListUseCase = AnimeGetListUseCase(repository)
    private val animeRemoveItemUseCase = AnimeRemoveItemUseCase(repository)


    val animeList = animeGetListUseCase.addGetList()

    fun deleteAnimeItem(animeItem: AnimeItem){
        viewModelScope.launch {
            animeRemoveItemUseCase.removeAnimeItem(animeItem)
        }
    }

//    fun changeAnimeItem(animeItem: AnimeItem){
//        viewModelScope.launch {
//            val newAnimeItem = animeItem.copy()
//            animeEditItemUseCase.editAnimeItem(newAnimeItem)
//        }
//    }




}