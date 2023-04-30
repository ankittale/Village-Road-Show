package com.ankitt.thevillageroadshow.ui.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TableLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.ankitt.thevillageroadshow.R
import com.ankitt.thevillageroadshow.ui.adapter.MoviePagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment(R.layout.fragment_home) {

//    private var goToMovieScreen: Button? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val movieTabLayout = view.findViewById<TabLayout>(R.id.movie_tab)

        val movieViewPager = view.findViewById<ViewPager2>(R.id.movie_view_pager)
        movieViewPager.adapter = MoviePagerAdapter(this@HomeFragment)

        TabLayoutMediator(movieTabLayout, movieViewPager){ tab, postion ->
            when(postion){
                0 -> tab.text = "Popular"
                1 -> tab.text = "Top Rated"
            }
        }.attach()



        /*goToMovieScreen = view.findViewById(R.id.movie_call) as Button
        goToMovieScreen?.setOnClickListener {
            val movieAction = HomeFragmentDirections.actionHomeFragmentToMovieFragment()
            navController.navigate(movieAction)
        }*/
    }
}