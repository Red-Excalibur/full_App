package com.anime_fun_facts.feature_anime.presentation

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import com.anime_fun_facts.feature_anime.presentation.anime_list_Screen.AnimesScreen
import com.anime_fun_facts.feature_anime.presentation.navigation.NavHostOfMe
import com.anime_fun_facts.ui.theme.Anime_Fun_factsTheme
import dagger.hilt.android.AndroidEntryPoint

//var contextt:Context ?=null
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        contextt=this
        setContent {
            Anime_Fun_factsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                 NavHostOfMe()
                }
            }
        }
    }
}

