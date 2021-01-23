package com.benjaminbenoit.tmdbApp.ui.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.benjaminbenoit.tmdbApp.R
import com.benjaminbenoit.tmdbApp.ui.popularmovies.PopularMoviesActivity

class ActivitySplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val textSplashScreen = findViewById<TextView>(R.id.textSplashScreen);
        textSplashScreen.alpha = 0f
        textSplashScreen.animate().setDuration(1500).alpha(1f).withEndAction {
            val i = Intent(this, PopularMoviesActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}