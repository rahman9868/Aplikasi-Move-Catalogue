package com.chairul.moviecatalogue

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeLeft
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import com.chairul.moviecatalogue.utils.DataDummy
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.endsWith
import org.junit.Rule
import org.junit.Test

class MainActivityTest{
    private val dummyMovies = DataDummy.generateDummyMovies()
    private val dummyTvShow = DataDummy.generateDummyTvShow()

    @get:Rule
    var activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun loadMovie() {
        onView(withId(R.id.rvMovies)).check(matches(isDisplayed()))
        onView(withId(R.id.rvMovies)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovies.size))
    }


    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rvMovies)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.txtTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.txtTitle)).check(matches(withText(dummyMovies[0].title)))
        onView(withId(R.id.txtGenre)).check(matches(isDisplayed()))
        onView(withId(R.id.txtGenre)).check(matches(withText(dummyMovies[0].genre)))
        onView(withId(R.id.imgDetail)).check(matches(isDisplayed()))
        onView(allOf(withId(R.id.imgDetail),
            hasBackground(R.drawable.avatar), isDisplayed()))
        onView(withId(R.id.txtOverview)).check(matches(isDisplayed()))
        onView(withId(R.id.txtOverview)).check(matches(withText(dummyMovies[0].overview)))
        onView(withId(R.id.txtYear)).check(matches(isDisplayed()))
        onView(withId(R.id.txtYear)).check(matches(withText(dummyMovies[0].year)))
        onView(withId(R.id.txtArtist)).check(matches(isDisplayed()))
        onView(withId(R.id.txtArtist)).check(matches(withText(dummyMovies[0].cast)))
        onView(withId(R.id.txtProduction)).check(matches(isDisplayed()))
        onView(withId(R.id.txtProduction)).check(matches(withText(dummyMovies[0].production)))
        onView(withId(R.id.txtRate)).check(matches(isDisplayed()))
        onView(withId(R.id.txtRate)).check(matches(withText(dummyMovies[0].rate.toString())))
}

    @Test
    fun loadTvShow() {
        onView(withId(R.id.viewpager_main)).perform(swipeLeft())
        onView(withId(R.id.rvTvShow)).check(matches(isDisplayed()))
        onView(withId(R.id.rvTvShow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
    }


    @Test
    fun loadDetailTvShow() {
        onView(withText("Tv Show")).perform(click())
        onView(withId(R.id.rvTvShow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.txtTvTitle)).check(matches(isDisplayed()))
        onView(withId(R.id.txtTvTitle)).check(matches(withText(endsWith(dummyTvShow[0].title))))
        onView(withId(R.id.txtGenre)).check(matches(isDisplayed()))
        onView(withId(R.id.txtGenre)).check(matches(withText(dummyTvShow[0].genre)))
        onView(allOf(withId(R.id.imgDetail),
            hasBackground(R.drawable.transformers_prime), isDisplayed()))
        onView(withId(R.id.txtOverview)).check(matches(isDisplayed()))
        onView(withId(R.id.txtOverview)).check(matches(withText(dummyTvShow[0].overview)))
        onView(withId(R.id.txtYear)).check(matches(isDisplayed()))
        onView(withId(R.id.txtYear)).check(matches(withText(dummyTvShow[0].year)))
        onView(withId(R.id.txtArtist)).check(matches(isDisplayed()))
        onView(withId(R.id.txtArtist)).check(matches(withText(dummyTvShow[0].cast)))
    }



}