package com.example.catalist.details

import com.example.catalist.details.api.model.PhotoApiModel
import com.example.catalist.details.model.DetailsUiModel
import com.example.catalist.details.model.PhotoUiModel

interface DetailsContract {
    data class DetailsUiState(
        val breedId: String,
        val data: DetailsUiModel? = null,
        val image: PhotoUiModel,
        val fetching: Boolean = false,
        val error: DetailsError? = null,
    )
    {
        sealed class DetailsError {
            data class DataUpdateFailed(val cause: Throwable? = null) : DetailsError()
        }
    }

}