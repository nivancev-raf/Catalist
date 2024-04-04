package com.example.catalist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.catalist.repository.SampleBreeds
import com.example.catalist.ui.composables.AppNavigation
import com.example.catalist.ui.composables.BreedListScreen
import com.example.catalist.ui.theme.CatalistTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CatalistTheme {
                // Ovo može biti Breed List Screen umesto Greeting komponente
//                BreedListScreen(
//                    breeds = SampleBreeds, // Pretpostavka da imate SampleBreeds listu dostupnu
//                    onBreedClick = { /* Handle breed click */ }
//                )
                AppNavigation()

            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//            text = "Hello $name!",
//            modifier = modifier
//    )
//}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    CatalistTheme {
//        Greeting("Android")
//    }
//}