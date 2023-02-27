package com.example.animeapp.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface AppDatabaseDao {

    @Query ("SELECT * FROM anime_db")
    fun getAnimeList(): LiveData<List<AnimeItemDbModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addAnimeItem(animeItemDbModel: AnimeItemDbModel)

    @Query("SELECT * FROM anime_db WHERE id= :animeItemId")
    fun getAnimeItem(animeItemId: Int)

    @Query("DELETE FROM anime_db WHERE id= :animeItemId LIMIT 1")
    fun removeAnimeItem(animeItemId: Int): AnimeItemDbModel


}