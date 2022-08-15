package com.anime_fun_facts.feature_anime.presentation.anime_list_Screen

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.anime_fun_facts.feature_anime.domain.model.animes_model.Animes_Data
import com.anime_fun_facts.feature_anime.presentation.navigation.Routes

@Composable
fun AnimesScreen  (
    viewModel: AnimesViewModel= hiltViewModel(),
    navController: NavController
){
    val animes = viewModel.state.collectAsState()

    val context = LocalContext.current



    Spacer(modifier = Modifier.height(10.dp))
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ){
        items(animes.value){anime-> 
            MyCard(animes = anime,
                {navController?.navigate( "${Routes.Anime_Details_Screen.route}/${anime.anime_name}")}
            )

            
        }
    }

}


@Composable
fun MyCard(
    animes :Animes_Data,
    navigate :()->Unit
    ){

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable {
                navigate()
            }
    ) {
        Image(painter = rememberAsyncImagePainter(animes.anime_img),
            contentDescription =null,
            modifier = Modifier.size(150.dp)
        )
        Column(
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = " the anime name id : ${animes.anime_id}")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = " the anime name is :")
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = " ${animes.anime_name}",
                fontSize = 18.sp,
                color = Color.Red,
                modifier = Modifier.fillMaxWidth()

            )
        }
    }
}

