package com.benjaminbenoit.tmdbApp.api

import com.benjaminbenoit.tmdbApp.model.PopularMovieResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface tmdbInterface {
    @GET("movie/popular")
    fun getAllTrending(@Query("api_key") apiKey :String) : Call<PopularMovieResult>
}