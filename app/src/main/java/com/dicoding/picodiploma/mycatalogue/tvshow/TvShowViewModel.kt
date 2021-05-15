package com.dicoding.picodiploma.mycatalogue.tvshow

import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.mycatalogue.data.VideoContent
import com.dicoding.picodiploma.mycatalogue.utils.DataDummy

class TvShowViewModel : ViewModel() {

    fun getTvShows() : List<VideoContent> = DataDummy.generateDummyTvShows()
}