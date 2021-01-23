package com.benjaminbenoit.tmdbApp.model

data class Movie(
    var id :Long,
    var overview :String,
    var release_date :String,
    var vote_average :Double,
    var poster_path :String,
    var title :String
)