package com.ankitt.thevillageroadshow.ui.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ankitt.thevillageroadshow.R

class PopularFragment : Fragment(R.layout.fragment_popular) {

    private var buttonToMovieScreen: Button? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonToMovieScreen = view.findViewById(R.id.button_movie_call)
        buttonToMovieScreen?.setOnClickListener {
            val actionToMovie = HomeFragmentDirections.actionHomeFragmentToMovieFragment()
            findNavController().navigate(actionToMovie)
        }
    }

}