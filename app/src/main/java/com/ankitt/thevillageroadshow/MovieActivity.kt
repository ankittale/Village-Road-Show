package com.ankitt.thevillageroadshow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView

class MovieActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContentView(R.layout.activity_movie)

        //Support Action Bar
        val actionToolbar = findViewById<MaterialToolbar>(R.id.action_toolbar)
        setSupportActionBar(actionToolbar)

        //Setup NavController and NavHostFragment
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        navController = navHostFragment.navController

        //Setup AppBarConfiguration
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment, R.id.searchMovieFragment, R.id.savedMovieFragment))
        setupActionBarWithNavController(navController, appBarConfiguration)

        //Bind NavController to BottomView
        bottomNavigationView.setupWithNavController(navController)
    }
}