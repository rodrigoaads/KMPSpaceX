package presentation.pages

import model.LaunchModel

data class UiModel(
    val list: List<LaunchModel> = listOf(),
    val error: Boolean = false,
    val isLoading: Boolean = true
)