package com.chairul.moviecatalogue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.chairul.moviecatalogue.entity.TvShow
import com.chairul.moviecatalogue.viewModel.DetailTvShowViewModel
import kotlinx.android.synthetic.main.activity_detail_tv_show.*

class DetailTvShowActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tv_show)

        val idTvShow = intent.getStringExtra(DETAIL_TVSHOW)
        Log.v("ADX", "Detail TvShow ID -> \n $idTvShow")

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailTvShowViewModel::class.java]
        if(idTvShow != null ){
            viewModel.setSelectedTvShow(idTvShow)
            val tvShow = viewModel.getTvShow()
            fetchMovie(tvShow)
        }
        /*val tvShow = intent.getSerializableExtra(DETAIL_TVSHOW) as TvShow
        Log.v("ADX", "Detail Movie \n $tvShow")

        if (tvShow != null) {
            fetchMovie(tvShow)
        }

         */
    }

    private fun fetchMovie(tvShow: TvShow) {
            try{
                Glide.with(applicationContext).load(tvShow.imgPath).into(imgDetail)
                txtTvTitle.text = tvShow.title
                txtArtist.text = tvShow.cast
                txtGenre.text = tvShow.genre
                txtOverview.text = tvShow.overview
                txtProduction.text = tvShow.duration
                txtYear.text = tvShow.year
            }catch (e: Exception){

            }


    }

    companion object{
        val DETAIL_TVSHOW = "detail tvshow"
    }

}
