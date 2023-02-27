package com.example.animeapp.data

import com.example.animeapp.domain.AnimeItem

class AnimeListMapper {

    fun mapEntityToDbModel(animeItem: AnimeItem) = AnimeItemDbModel(
        id = animeItem.id,
        image = animeItem.image,
        title = animeItem.title,
        titleRussian = animeItem.titleRussian,
        description = animeItem.description,
        year = animeItem.year,
        rating = animeItem.rating
    )

    fun mapDbModelToEntity(animeItemDbModel: AnimeItemDbModel) = AnimeItem(
        id = animeItemDbModel.id,
        image = animeItemDbModel.image,
        title = animeItemDbModel.title,
        titleRussian = animeItemDbModel.titleRussian,
        description = animeItemDbModel.description,
        year = animeItemDbModel.year,
        rating = animeItemDbModel.rating
        )

    fun mapListDbModeToListEntity(list: List<AnimeItemDbModel>) = list.map {
        mapDbModelToEntity(it)
    }
}