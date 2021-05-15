package com.dicoding.picodiploma.mycatalogue.data

data class VideoContent (
    val id: String,
    val title: String,
    val date: String,
    val rating: Double,
    val overview: String,
    val trailerLink: String,
    val poster: Int
)