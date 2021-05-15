package com.dicoding.picodiploma.mycatalogue.detail

import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.mycatalogue.data.VideoContent
import com.dicoding.picodiploma.mycatalogue.utils.DataDummy

class DetailViewModel : ViewModel() {
    private lateinit var contentId: String
    private lateinit var contentType: String

    fun setSelectedContent(id: String, type: String) {
        contentId = id
        contentType = type
    }

    fun getSelectedContent(): VideoContent? {
        var selectedContent: VideoContent? = null
        var datas = ArrayList<VideoContent>()

        if (contentType == "movie") datas = DataDummy.generateDummyMovies() as ArrayList<VideoContent>
        else if (contentType == "tv") datas = DataDummy.generateDummyTvShows() as ArrayList<VideoContent>

        for (data in datas) {
            if (data.id == contentId) {
                selectedContent = data
            }
        }

        return selectedContent
    }
}