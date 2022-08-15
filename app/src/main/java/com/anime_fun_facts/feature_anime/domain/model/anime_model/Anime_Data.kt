package com.anime_fun_facts.feature_anime.domain.model.anime_model

import androidx.room.Entity
import androidx.room.PrimaryKey

/*@Entity*/
data class Anime_Data(
    val fact: String,
    /*@PrimaryKey */ val fact_id: Int
)