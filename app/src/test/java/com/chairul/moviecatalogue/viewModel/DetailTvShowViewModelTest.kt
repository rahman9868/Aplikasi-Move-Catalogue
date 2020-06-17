package com.chairul.moviecatalogue.viewModel

import com.chairul.moviecatalogue.utils.DataDummy
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class DetailTvShowViewModelTest {
    private lateinit var viewModel: DetailTvShowViewModel
    private val dummyTvShow = DataDummy.generateDummyTvShow()[0]

    @Before
    fun setUp() {
        viewModel = DetailTvShowViewModel()
    }

    @Test
    fun getTvShow() {
        viewModel.setSelectedTvShow(dummyTvShow.id.toString())
        val tvShowEntity = viewModel.getTvShow()
        assertNotNull(tvShowEntity)
        assertEquals(dummyTvShow.id, tvShowEntity.id)
        assertEquals(dummyTvShow.year, tvShowEntity.year)
        assertEquals(dummyTvShow.title, tvShowEntity.title)
        assertEquals(dummyTvShow.overview, tvShowEntity.overview)
        assertEquals(dummyTvShow.imgPath, tvShowEntity.imgPath)
        assertEquals(dummyTvShow.genre, tvShowEntity.genre)
        assertEquals(dummyTvShow.duration, tvShowEntity.duration)
        assertEquals(dummyTvShow.cast, tvShowEntity.cast)
    }
}