package com.chairul.moviecatalogue.viewModel

import androidx.lifecycle.ViewModel
import com.chairul.moviecatalogue.entity.Movie
import com.chairul.moviecatalogue.utils.DataDummy

class MoviesViewModel : ViewModel() {

    fun getMovie() : List<Movie> = DataDummy.generateDummyMovies()
}