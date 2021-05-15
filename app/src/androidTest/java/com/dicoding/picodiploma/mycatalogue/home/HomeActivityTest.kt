package com.dicoding.picodiploma.mycatalogue.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import com.dicoding.picodiploma.mycatalogue.R
import com.dicoding.picodiploma.mycatalogue.utils.DataDummy
import org.junit.Before
import org.junit.Test

class HomeActivityTest {
    private val mockTvShows = DataDummy.generateDummyTvShows()
    private val mockMovies = DataDummy.generateDummyMovies()

    @Before
    fun setUp() {
        ActivityScenario.launch(HomeActivity::class.java)
    }

    @Test
    fun loadTvShows() {
        onView(withText(R.string.tvshows)).perform(click())
        onView(withId(R.id.rv_tv_show)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tv_show)).perform(
                RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                        mockTvShows.size
                )
        )
    }

    @Test
    fun loadDetailTvShow() {
        onView(withText(R.string.tvshows)).perform(click())
        onView(withId(R.id.rv_tv_show)).perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                        0,
                        click()
                )
        )
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title)).check(matches(withText(mockTvShows[0].title)))

        onView(withId(R.id.tv_date)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_date)).check(matches(withText(mockTvShows[0].date)))

        onView(withId(R.id.tv_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_rating)).check(matches(withText("(${mockTvShows[0].rating} %)")))

        onView(withId(R.id.tv_overview_txt)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_overview_txt)).check(matches(withText(mockTvShows[0].overview)))

        onView(withId(R.id.image_poster)).check(matches(isDisplayed()))
    }

    @Test
    fun loadMovies() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(
                RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                        mockMovies.size
                )
        )
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rv_movie)).perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                        0,
                        click()
                )
        )
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title)).check(matches(withText(mockMovies[0].title)))

        onView(withId(R.id.tv_date)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_date)).check(matches(withText(mockMovies[0].date)))

        onView(withId(R.id.tv_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_rating)).check(matches(withText("(${mockMovies[0].rating} %)")))

        onView(withId(R.id.tv_overview_txt)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_overview_txt)).check(matches(withText(mockMovies[0].overview)))

        onView(withId(R.id.image_poster)).check(matches(isDisplayed()))
    }
}