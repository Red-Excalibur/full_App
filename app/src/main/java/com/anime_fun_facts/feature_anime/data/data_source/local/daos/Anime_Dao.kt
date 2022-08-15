//package com.anime_fun_facts.feature_anime.data.data_source.local.daos
//
//import androidx.room.*
//import com.anime_fun_facts.feature_anime.domain.model.anime_model.Anime_Data
//
//@Dao
//interface Anime_Dao {
//
//    @Insert(onConflict =OnConflictStrategy.REPLACE)
//    suspend fun insert(dataAnime: Anime_Data)
//
//    @Delete
//    suspend fun deleteNote(dataAnime: Anime_Data)
//
//    @Query("SELECT * FROM data_anime WHERE fact_id =:id")
//    suspend fun getAnimeById(id : Int):Anime_Data?
//
//    @Query("SELECT * FROM Anime_Data")
//    fun getAllAnime(): List<Anime_Data>
//
//}