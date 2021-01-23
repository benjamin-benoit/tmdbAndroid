package com.benjaminbenoit.tmdbApp.repository

import com.benjaminbenoit.tmdbApp.api.tmdbApi
import com.benjaminbenoit.tmdbApp.utils.Constants

class tmdbRepository {
    private val apiService = tmdbApi().getTheMovieDbApiService()

    suspend fun getPopularMoviesList() = apiService.getAllTrending(Constants.API_KEY)
}