package com.chairul.moviecatalogue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewpager_main.adapter = MoviePagerAdapter(supportFragmentManager)
        tabs.setupWithViewPager(viewpager_main)

    }


    inner class MoviePagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm){
        var pages = mutableListOf(
            MoviesFragment(),
            TvShowFragment()
        )

        override fun getItem(position: Int): Fragment {
            return pages[position]
        }

        override fun getCount(): Int {
            return pages.size
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return when (position) {
                0 -> "Movie"
                1 -> "Tv Show"
                else -> ""
            }

        }

    }
}
