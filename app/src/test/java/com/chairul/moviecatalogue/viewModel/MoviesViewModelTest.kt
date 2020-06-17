package com.chairul.moviecatalogue.viewModel

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MoviesViewModelTest {

    private lateinit var viewModel: MoviesViewModel

    @Before
    fun setUp() {
        viewModel = MoviesViewModel()
    }

    @Test
    fun getMovie() {

        val moviesEntity = viewModel.getMovie()
        assertNotNull(moviesEntity)
        assertEquals(10, moviesEntity.size)
    }
}