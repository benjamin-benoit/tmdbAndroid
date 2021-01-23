package com.benjaminbenoit.tmdbApp.api

import com.benjaminbenoit.tmdbApp.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class tmdbApi {
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(Constants.BASE_URL)
        .build()

    fun getTheMovieDbApiService() = retrofit.create(tmdbInterface::class.java)
}