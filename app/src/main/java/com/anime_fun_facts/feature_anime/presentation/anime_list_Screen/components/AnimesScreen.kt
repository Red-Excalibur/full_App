package com.anime_fun_facts.feature_anime.presentation.anime_list_Screen

import android.media.Image
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.anime_fun_facts.feature_anime.domain.model.animes_model.Animes_Data
import com.anime_fun_facts.feature_anime.presentation.anime_list_Screen.components.MyCard
import com.anime_fun_facts.feature_anime.presentation.navigation.Routes
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

@Composable
fun AnimesScreen  (
     viewModel: AnimesViewModel= hiltViewModel(),
    navController: NavController
) {

    val animes =  viewModel.state.collectAsState()

    val context = LocalContext.current
    //for the url cuz the // and / in the Url make us a problem with the navigation
    //remember that Url == Nav arguments so it will think that the url is a lot of other arguments
    Spacer(modifier = Modifier.height(10.dp))


    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {

        items(animes.value) { anime ->
            val encodedUrl = URLEncoder.encode("${anime.anime_img}", StandardCharsets.UTF_8.toString())
          //  navController.navigate("HistoryDetail/$encodedUrl")
            MyCard(
                animes = anime,
                {navController?.navigate( "${Routes.Anime_Details_Screen.route}/${anime.anime_name}/$encodedUrl")}
            )


        }


    }
//   Column(
//       modifier = Modifier
//           .verticalScroll(rememberScrollState()))
//            {
//     for (i in animes.value) {
//           MyCard(animes = i ,{})
//       }
//
//   }

}

//@Preview
//@Composable
//fun See2(      viewModel: AnimesViewModel= hiltViewModel()
//){
//    AnimesScreen(  viewModel)
//
//
//}



