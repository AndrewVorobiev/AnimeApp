package com.example.animeapp.data

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.animeapp.domain.AnimeItem
import com.example.animeapp.domain.AnimeRepository

class AnimeRepositoryImpl(application: Application) : AnimeRepository {

    private val appDatabaseDao = AppDatabase.getInstance(application).appDatabaseDao()
    private val mapper = AnimeListMapper()


    override fun addAnimeItem(animeItem: AnimeItem) {
        appDatabaseDao.addAnimeItem(mapper.mapEntityToDbModel(animeItem))
    }

    override fun editAnimeItem(animeItem: AnimeItem) {
        appDatabaseDao.addAnimeItem(mapper.mapEntityToDbModel(animeItem))
    }

    override fun getAnimeItem(animeItemId: Int): AnimeItem {
        val dbModel = appDatabaseDao.getAnimeItem(animeItemId)
        return mapper.mapDbModelToEntity(dbModel)
    }

    override fun getAnimeList(): LiveData<List<AnimeItem>> = Transformations.map(
        appDatabaseDao.getAnimeList()
    ) {
        mapper.mapListDbModeToListEntity(it)
    }

    override fun removeAnimeItem(animeItem: AnimeItem) {
        appDatabaseDao.removeAnimeItem(animeItem.id)
    }
}