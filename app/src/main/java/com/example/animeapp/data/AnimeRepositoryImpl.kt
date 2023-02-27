package com.example.animeapp.data

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.animeapp.domain.AnimeItem
import com.example.animeapp.domain.AnimeRepository

class AnimeRepositoryImpl(application: Application): AnimeRepository {

    private val appDatabaseDao = AppDatabase.getInstance(application).appDatabaseDao()



    override fun addAnimeItem(animeItem: AnimeItem) {
        TODO("Not yet implemented")
    }

    override fun editAnimeItem(animeItem: AnimeItem) {
        TODO("Not yet implemented")
    }

    override fun getAnimeItem(animeItemId: Int) {
        TODO("Not yet implemented")
    }

    override fun getAnimeList(): LiveData<List<AnimeItem>> {
        TODO("Not yet implemented")
    }

    override fun removeAnimeItem(animeItem: AnimeItem) {
        TODO("Not yet implemented")
    }
}