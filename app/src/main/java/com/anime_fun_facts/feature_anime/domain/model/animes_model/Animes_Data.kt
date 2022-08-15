package com.anime_fun_facts.feature_anime.domain.model.animes_model

import androidx.room.Entity
import androidx.room.PrimaryKey

/*@Entity*/
data class Animes_Data(
   /* @PrimaryKey */val anime_id: Int,
    val anime_img: String,
    val anime_name: String
)