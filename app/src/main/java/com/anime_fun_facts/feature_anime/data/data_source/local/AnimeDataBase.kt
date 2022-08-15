//package com.anime_fun_facts.feature_anime.data.data_source.local
//
//import androidx.room.Database
//import androidx.room.RoomDatabase
//import com.anime_fun_facts.feature_anime.data.data_source.local.daos.Anime_Dao
//import com.anime_fun_facts.feature_anime.data.data_source.local.daos.Animes_Dao
//import com.anime_fun_facts.feature_anime.domain.model.anime_model.Anime_Data
//import com.anime_fun_facts.feature_anime.domain.model.animes_model.Animes_Data
//
//@Database(
//    entities = [Animes_Data::class,Anime_Data::class],
//    version = 1
//)
//abstract class AnimeDataBase :RoomDatabase(){
//
//    abstract val   animesDao : Animes_Dao
//    abstract val animeDao : Anime_Dao
//
//    companion object {
//        const val DATABASE_NAME ="notes_db"
//    }
//}