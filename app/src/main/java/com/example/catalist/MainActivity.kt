package com.example.catalist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import com.example.catalist.ui.composables.AppNavigation
import com.example.catalist.ui.theme.CatalistTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CatalistTheme {
                AppNavigation()
            }
        }
    }
}
