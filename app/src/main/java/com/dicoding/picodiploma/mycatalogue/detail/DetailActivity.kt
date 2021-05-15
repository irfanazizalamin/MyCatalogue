package com.dicoding.picodiploma.mycatalogue.detail

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.dicoding.picodiploma.mycatalogue.R
import com.dicoding.picodiploma.mycatalogue.data.VideoContent
import com.dicoding.picodiploma.mycatalogue.databinding.ActivityDetailBinding
import com.dicoding.picodiploma.mycatalogue.databinding.ContentDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var viewModel: DetailViewModel
    private lateinit var detailContentBinding: ContentDetailBinding

    companion object {
        const val EXTRA_CONTENT_TYPE = "extra_content_type"
        const val EXTRA_CONTENT_ID = "extra_content_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityDetailBinding = ActivityDetailBinding.inflate(layoutInflater)
        detailContentBinding = activityDetailBinding.detailContent

        setContentView(activityDetailBinding.root)
        setSupportActionBar(findViewById(R.id.toolbar))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())
                .get(DetailViewModel::class.java)

        val extras = intent.extras

        if (extras != null) {
            val contentType = extras.getString(EXTRA_CONTENT_TYPE)
            val contentId = extras.getString(EXTRA_CONTENT_ID)

            if (contentId != null && contentType != null) {
                viewModel.setSelectedContent(contentId, contentType)

                viewModel.getSelectedContent()?.let { populateContent(it) }
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun populateContent(selectedContent: VideoContent) {
        detailContentBinding.tvTitle.text = selectedContent.title
        detailContentBinding.tvDate.text = selectedContent.date
        detailContentBinding.tvOverviewTxt.text = selectedContent.overview

        Glide.with(this)
                .load(selectedContent.poster)
                .transform(RoundedCorners(20))
                .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                                .error(R.drawable.ic_error))
                .into(detailContentBinding.imagePoster)

        detailContentBinding.rbRating.rating = (selectedContent.rating / 20).toFloat()
        detailContentBinding.tvRating.text = "(${selectedContent.rating} %)"
        detailContentBinding.tvTrailerLink.text = selectedContent.trailerLink

        detailContentBinding.tvTrailerLink.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(selectedContent.trailerLink))
            startActivity(intent)
        }
    }
}