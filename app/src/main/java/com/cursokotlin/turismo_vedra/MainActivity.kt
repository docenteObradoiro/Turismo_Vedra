package com.cursokotlin.turismo_vedra

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.cursokotlin.turismo_vedra.productoresLocales.ProductoresLocales

class MainActivity : AppCompatActivity() {
    protected lateinit var video: VideoView
    protected lateinit var reproductorVideo: MediaPlayer
    protected var mCurrentVideoPosition: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*video=findViewById(R.id.videoBenvidos)
        val uri= Uri.parse("android.resource://"
                + packageName
                + "/"
                + R.raw.videobenvidos)
        video.keepScreenOn = true

        video.setVideoURI(uri)
        video.start()
        video.setOnPreparedListener { mp ->
            reproductorVideo=mp
            reproductorVideo.isLooping=true

            if (mCurrentVideoPosition !=0){
                reproductorVideo.seekTo(mCurrentVideoPosition)
                reproductorVideo.start()
            }

            //este cachito de abaixo é para mutear o video.
            if (mp.isPlaying()) {
                mp.stop()
                mp.release()
            }
            mp.setVolume(0f, 0f)
        }


        /*var accesoProductores= findViewById<Button>(R.id.productores)
        accesoProductores.setOnClickListener{
            val acceder = Intent(this, ProductoresLocales::class.java)
            startActivity(acceder)
        }*/

    }

    override fun onPause() {
        super.onPause()

        mCurrentVideoPosition=reproductorVideo.currentPosition
        video.pause()
    }

    override fun onResume() {
        super.onResume()

        video.start()
    }*/
        var menu=findViewById<ImageButton>(R.id.menuHamburguesa)
        menu.setOnClickListener {
            val acceder= Intent(this, MenuPrincipal::class.java)
            startActivity(acceder)
        }
    }
}