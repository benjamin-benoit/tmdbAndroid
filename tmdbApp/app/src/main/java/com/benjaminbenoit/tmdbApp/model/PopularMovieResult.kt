package com.benjaminbenoit.tmdbApp.model

data class PopularMovieResult(
    var page :Int,
    var results :List<Movie>
)