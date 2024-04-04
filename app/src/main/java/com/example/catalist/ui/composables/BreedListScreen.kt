package com.example.catalist.ui.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.catalist.R
import com.example.catalist.model.Breed
import com.example.catalist.repository.SampleBreeds
import com.example.catalist.ui.theme.CatalistTheme

@OptIn(ExperimentalComposeUiApi::class)
@ExperimentalMaterial3Api
@Composable
fun BreedListScreen(
    breeds: List<Breed>,
    onBreedClick: (Breed) -> Unit,
) {
    var searchText by remember { mutableStateOf("") }
    val filteredBreeds = breeds.filter {
        searchText.isEmpty() || it.name.contains(searchText, ignoreCase = true)
    }
    // Kontroler tastature kojim možemo upravljati softverskom tastaturom
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusManager = LocalFocusManager.current

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = stringResource(id = R.string.breed_list))
                }
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .fillMaxSize()
                    .padding(it),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Search TextField
                OutlinedTextField(
                    value = searchText,
                    onValueChange = { newText ->
                        searchText = newText

                    },
                    label = { Text("Search") },
                    singleLine = true,  // sprecava prelazak u novi red (zatvara search na enter)
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = "Search"
                        )
                    },
                    keyboardOptions = KeyboardOptions.Default.copy(
                        // imeAction - Input Method Editor Action
                        imeAction = ImeAction.Search // Postavljamo imeAction na 'Search'
                    ),
                    keyboardActions = KeyboardActions(
                        onSearch = {
                            keyboardController?.hide() // Sakrijemo tastaturu
                            focusManager.clearFocus() // Kursor nije u fokusu nakon search-a
                        }
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                )
                // Lista rasa
                filteredBreeds.forEach { breed ->
                    BreedListItem(
                        breed = breed,
                        onClick = {
                            onBreedClick(breed)
                        }
                    )
                    Divider()
                }
            }
        }
    )
}
@Composable
fun BreedListItem(
    breed: Breed,
    onClick: () -> Unit,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .clickable(onClick = onClick),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = breed.name,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.weight(1f)
            )
            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = "Go to details"
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun PreviewBreedListScreen() {
    CatalistTheme {
        BreedListScreen(
            breeds = SampleBreeds,
            onBreedClick = {}
        )
    }
}
