package com.chairul.moviecatalogue.viewModel

import com.chairul.moviecatalogue.utils.DataDummy
import junit.framework.TestCase.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.Assert.*

class DetailMovieViewModelTest {

    private lateinit var viewModel: DetailMovieViewModel
    private val dummyMovie = DataDummy.generateDummyMovies()[0]

    @Before
    fun setUp() {
        viewModel = DetailMovieViewModel()
    }

    @Test
    fun getMovie() {
        viewModel.setSelectedMovie(dummyMovie.id.toString())
        val movieEntity = viewModel.getMovie()
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.id, movieEntity.id)
        assertEquals(dummyMovie.title, movieEntity.title)
        assertEquals(dummyMovie.genre, movieEntity.genre)
        assertEquals(dummyMovie.rate, movieEntity.rate, 0.0)
        assertEquals(dummyMovie.production, movieEntity.production)
        assertEquals(dummyMovie.cast, movieEntity.cast)
        assertEquals(dummyMovie.overview, movieEntity.overview)
        assertEquals(dummyMovie.year, movieEntity.year)
        assertEquals(dummyMovie.imgPath, movieEntity.imgPath)

    }
}