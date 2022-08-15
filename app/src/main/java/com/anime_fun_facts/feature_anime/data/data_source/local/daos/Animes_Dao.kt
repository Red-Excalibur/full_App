//package com.anime_fun_facts.feature_anime.data.data_source.local.daos
//
//import androidx.room.*
//import com.anime_fun_facts.feature_anime.domain.model.animes_model.Animes_Data
//
//@Dao
//interface Animes_Dao {
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insert(dataAnimes: Animes_Data)
//
//    @Delete
//    suspend fun deleteNote(dataAnimes: Animes_Data)
//
//    @Query("SELECT * FROM animes_data WHERE anime_id=:id")
//    suspend fun getAnimeById(id : Int): Animes_Data?
//
//    @Query("SELECT * FROM animes_data")
//    fun getAllAnimes(): List<Animes_Data>
//}