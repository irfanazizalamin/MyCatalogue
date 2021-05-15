package com.dicoding.picodiploma.mycatalogue.tvshow

import com.dicoding.picodiploma.mycatalogue.data.VideoContent
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class TvShowViewModelTest {
    private lateinit var tvShowViewModel: TvShowViewModel
    private var mockTvShowsData = ArrayList<VideoContent>()

    @Before
    fun init() {
        tvShowViewModel = TvShowViewModel()
    }

    @Test
    fun getTvShowsWhenDataIsEmpty() {
        assertNotNull(mockTvShowsData)
        assertEquals(0, mockTvShowsData.size)
    }

    @Test
    // when data is not empty
    fun getTvShows() {
        mockTvShowsData.add(
                VideoContent(
                        "tv-1",
                        "mock-title-1",
                        "1/1/2021",
                        66.0,
                        "mock overview 1",
                        "https://youtu.be/mock-1",
                        0
                )
        )

        mockTvShowsData.add(
                VideoContent(
                        "tv-2",
                        "mock-title-2",
                        "2/2/2021",
                        77.0,
                        "mock overview 2",
                        "https://youtu.be/mock-2",
                        0
                )
        )

        assertNotNull(mockTvShowsData)
        assertEquals(2, mockTvShowsData.size)
    }
}