package com.example.retrofit.main

import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

interface DisneyApi {
    companion object {
        val instance = Retrofit.Builder().baseUrl("https://api.disneyapi.dev/")
            .addConverterFactory(MoshiConverterFactory.create())
            .client(OkHttpClient.Builder().build()).build().create(DisneyApi::class.java)
    }
    @GET("characters")
    suspend fun getCharacters(): CharactersResponse
}