package com.example.catalist.ui.composables

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.catalist.breeds.list.cats
import com.example.catalist.details.breedDetails


@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost( //
        navController = navController,
        startDestination = "breeds"
    ) {
        cats(
            route = "breeds",
            onBreedClick = {
                navController.navigate(route = "breeds/$it")
            }
        )

        breedDetails(
            route = "breeds/{Id}",
            onClose = {
                navController.navigateUp()
            }
        )
    }



}