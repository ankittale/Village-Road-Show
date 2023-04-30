package com.ankitt.thevillageroadshow.ui.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ankitt.thevillageroadshow.ui.fragment.PopularFragment
import com.ankitt.thevillageroadshow.ui.fragment.TopRatedFragment

class MoviePagerAdapter(userFragment: Fragment) : FragmentStateAdapter(userFragment) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PopularFragment()
            1 -> TopRatedFragment()
            else -> PopularFragment()
        }
    }

}