package com.example.myyoutubesample

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class MainActivity : AppCompatActivity() {
    lateinit var youTubePlayerView : YouTubePlayerView
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getSupportFragmentManager().beginTransaction()
            .replace(R.id.container, PlayerrFragment())
            .commit()

//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
//        navController = navHostFragment.navController

//        youTubePlayerView = findViewById(R.id.youtube_player_view)
//        lifecycle.addObserver(youTubePlayerView)
    }

//    override fun onConfigurationChanged(newConfig: Configuration) {
//        super.onConfigurationChanged(newConfig)
//
//        // Checks the orientation of the screen
//        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            youTubePlayerView.enterFullScreen()
//        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
//            youTubePlayerView.exitFullScreen()
//        }
//    }
}