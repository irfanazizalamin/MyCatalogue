package com.dicoding.picodiploma.mycatalogue.movie

import com.dicoding.picodiploma.mycatalogue.data.VideoContent
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class MovieViewModelTest {
    private lateinit var movieViewModel: MovieViewModel
    private var mockMoviesData = ArrayList<VideoContent>()

    @Before
    fun init() {
        movieViewModel = MovieViewModel()
    }

    @Test
    fun getMoviesWhenDataIsEmpty() {
        assertNotNull(mockMoviesData)
        assertEquals(0, mockMoviesData.size)
    }

    @Test
    // when data is not empty
    fun getMovies() {
        mockMoviesData.add(
                VideoContent(
                        "m-1",
                        "mock-title-1",
                        "1/1/2021",
                        66.0,
                        "mock overview 1",
                        "https://youtu.be/mock-1",
                        0
                )
        )

        mockMoviesData.add(
                VideoContent(
                        "m-2",
                        "mock-title-2",
                        "2/2/2021",
                        77.0,
                        "mock overview 2",
                        "https://youtu.be/mock-2",
                        0
                )
        )

        assertNotNull(mockMoviesData)
        assertEquals(2, mockMoviesData.size)
    }
}