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
    suspend fun addAnimeItem(animeItemDbModel: AnimeItemDbModel)

    @Query("DELETE FROM anime_db WHERE id= :animeItemId LIMIT 1")
    suspend fun removeAnimeItem(animeItemId: Int)

    @Query("SELECT * FROM anime_db WHERE id= :animeItemId")
    suspend fun getAnimeItem(animeItemId: Int): AnimeItemDbModel




}