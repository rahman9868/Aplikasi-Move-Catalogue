package com.chairul.moviecatalogue.viewModel

import androidx.lifecycle.ViewModel
import com.chairul.moviecatalogue.entity.TvShow
import com.chairul.moviecatalogue.utils.DataDummy


class DetailTvShowViewModel : ViewModel() {

    private lateinit var idTvShow: String

    fun setSelectedTvShow(idTvShow: String){
        this.idTvShow = idTvShow
    }

    fun getTvShow(): TvShow{
        lateinit var tvShow: TvShow

        val tvShowEntity = DataDummy.generateDummyTvShow()

        for(tvShowEntity in tvShowEntity){
            if(tvShowEntity.id.toString() ==  idTvShow) {
                tvShow = tvShowEntity
            }
        }

        return tvShow
    }


}