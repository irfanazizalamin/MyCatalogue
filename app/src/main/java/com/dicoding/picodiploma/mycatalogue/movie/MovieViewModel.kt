package com.dicoding.picodiploma.mycatalogue.movie

import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.mycatalogue.data.VideoContent
import com.dicoding.picodiploma.mycatalogue.utils.DataDummy

class MovieViewModel : ViewModel() {

    fun getMovies() : List<VideoContent> = DataDummy.generateDummyMovies()
}