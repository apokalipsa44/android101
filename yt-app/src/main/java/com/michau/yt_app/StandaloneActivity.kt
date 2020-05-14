package com.michau.yt_app

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.youtube.player.YouTubeStandalonePlayer
import kotlinx.android.synthetic.main.activity_standalone.*
import java.lang.IllegalArgumentException

class StandaloneActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_standalone)

        btnPlayVideo.setOnClickListener(this)
        btnPlaylist.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = when (v?.id) {
            R.id.btnPlayVideo -> YouTubeStandalonePlayer.createVideoIntent(this, getString(R.string.GOOGLE_API_LEY), YT_VIDEO_ID)
            R.id.btnPlaylist -> YouTubeStandalonePlayer.createPlaylistIntent(this, getString(R.string.GOOGLE_API_LEY), YT_PLAYLIST_ID)
            else -> {
                throw IllegalArgumentException("Undef button  clicked")
            }
        }
        startActivity(intent)
    }

}