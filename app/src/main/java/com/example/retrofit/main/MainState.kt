package com.example.retrofit.main

data class MainState(
    val isLoading: Boolean = false,
    val characters: List<DisneyCharacter> = emptyList()
)
