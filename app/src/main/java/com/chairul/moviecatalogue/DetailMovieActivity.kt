package com.chairul.moviecatalogue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.chairul.moviecatalogue.entity.Movie
import com.chairul.moviecatalogue.viewModel.DetailMovieViewModel
import kotlinx.android.synthetic.main.activity_detail_movie.*

class DetailMovieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)

        val idMovie = intent.getStringExtra(DETAIL_MOVIE)
        Log.v("ADX", "Detail Movie ID -> \n $idMovie")

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailMovieViewModel::class.java]
        if(idMovie != null ){
            viewModel.setSelectedMovie(idMovie)
            val movie = viewModel.getMovie()
            fetchMovie(movie)
        }
    }

    private fun fetchMovie(movie: Movie) {
        try{
            Glide.with(applicationContext).load(movie.imgPath).into(imgDetail)
            txtRate.text = movie.rate.toString()
            txtTitle.text = movie.title
            txtGenre.text = movie.genre
            txtArtist.text = movie.cast
            txtOverview.text = movie.overview
            txtProduction.text = movie.production
            txtYear.text = movie.year
        }catch (e: Exception){

        }

    }

    companion object{
        val DETAIL_MOVIE = "detail movie"
    }
}
