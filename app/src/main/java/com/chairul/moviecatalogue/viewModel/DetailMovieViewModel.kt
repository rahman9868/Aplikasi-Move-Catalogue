package com.chairul.moviecatalogue.viewModel

import androidx.lifecycle.ViewModel
import com.chairul.moviecatalogue.entity.Movie
import com.chairul.moviecatalogue.utils.DataDummy

class DetailMovieViewModel : ViewModel() {
    private lateinit var idMovie: String

    fun setSelectedMovie(idMovie: String){
        this.idMovie = idMovie
    }

    fun getMovie(): Movie {
        lateinit var movie: Movie

        val moviewEntities = DataDummy.generateDummyMovies()

        for(movieEntity in moviewEntities){
            if(movieEntity.id.toString() ==  idMovie) {
                movie = movieEntity
            }
        }

        return movie
    }
}