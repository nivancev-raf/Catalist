package com.example.catalist.ui.composables

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.catalist.repository.CatRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavigation() {

    //
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "list"
    ) {
        composable(
            route = "list"
        ) {
            BreedListScreen(
                breeds =  CatRepository.allCats(),
                onBreedClick = {
                    navController.navigate(route = "list/${it.id}")
                }
            )
        }
        composable(
            route = "list/{id}"
        ) { backStackEntry ->
            val breedId = backStackEntry.arguments?.getString("id") // 'arguments?' - ako je arg. null vraca null
            BreedDetailsScreen(
                breed = breedId?.let { CatRepository.getById(id = it) },
                onClose = {
                    navController.navigateUp()
                }
                // let je standardna funkcija proširenja u
                // Kotlinu koja omogućava da se kod unutar {} izvrši samo ako breedId nije null.
            )
        }
    }



}