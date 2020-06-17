package com.chairul.moviecatalogue.entity

import java.io.Serializable

data class Movie(
    val id: Int,
    val title: String,
    val overview: String,
    val year: String,
    val cast: String,
    val genre: String,
    val production: String,
    val imgPath: Int,
    val rate: Double
) : Serializable

data class TvShow(
    val id: Int,
    val title: String,
    val cast: String,
    val overview: String,
    val genre: String,
    val year: String,
    val duration: String,
    val imgPath: Int
): Serializable