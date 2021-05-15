package com.dicoding.picodiploma.mycatalogue.detail

import com.dicoding.picodiploma.mycatalogue.utils.DataDummy
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class DetailViewModelTest {
    private lateinit var detailTvShowViewModel: DetailViewModel
    private lateinit var detailMovieViewModel: DetailViewModel
    private val mockTvShow = DataDummy.generateDummyTvShows()[0]
    private val mockMovie = DataDummy.generateDummyMovies()[0]
    private val tvShowId = mockTvShow.id
    private val movieId = mockMovie.id

    // TvShow Scope
    @Before
    fun setUpTvShow() {
        detailTvShowViewModel = DetailViewModel()
        detailTvShowViewModel.setSelectedContent(tvShowId, "tv")
    }

    @Test
    fun getTvShow() {
        val tvShow = detailTvShowViewModel.getSelectedContent()
        assertNotNull(tvShow)

        assertEquals(mockTvShow.id, tvShow?.id)
        assertEquals(mockTvShow.title, tvShow?.title)
        assertEquals(mockTvShow.rating, tvShow?.rating)
        assertEquals(mockTvShow.date, tvShow?.date)
        assertEquals(mockTvShow.overview, tvShow?.overview)
        assertEquals(mockTvShow.trailerLink, tvShow?.trailerLink)
        assertEquals(mockTvShow.poster, tvShow?.poster)
    }



    // Movie Scope
    @Before
    fun setMovie() {
        detailMovieViewModel = DetailViewModel()
        detailMovieViewModel.setSelectedContent(movieId, "movie")
    }

    @Test
    fun getMovie() {
        val movie = detailMovieViewModel.getSelectedContent()
        assertNotNull(movie)

        assertEquals(mockMovie.id, movie?.id)
        assertEquals(mockMovie.title, movie?.title)
        assertEquals(mockMovie.rating, movie?.rating)
        assertEquals(mockMovie.date, movie?.date)
        assertEquals(mockMovie.overview, movie?.overview)
        assertEquals(mockMovie.trailerLink, movie?.trailerLink)
        assertEquals(mockMovie.poster, movie?.poster)
    }
}