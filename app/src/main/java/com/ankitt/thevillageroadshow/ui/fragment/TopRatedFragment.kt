package com.ankitt.thevillageroadshow.ui.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ankitt.thevillageroadshow.R

class TopRatedFragment : Fragment(R.layout.fragment_top_rated) {

    private var buttonToMovieScreen: Button? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonToMovieScreen = view.findViewById(R.id.button_top_movie_call)
        buttonToMovieScreen?.setOnClickListener {
            val actionToMovie = HomeFragmentDirections.actionHomeFragmentToMovieFragment()
            findNavController().navigate(actionToMovie)
        }
    }

}