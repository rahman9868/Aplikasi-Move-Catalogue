package com.chairul.moviecatalogue.viewModel

import androidx.lifecycle.ViewModel
import com.chairul.moviecatalogue.entity.TvShow
import com.chairul.moviecatalogue.utils.DataDummy

class TvShowViewModel : ViewModel() {

    fun getTvShow() : List<TvShow> = DataDummy.generateDummyTvShow()
}