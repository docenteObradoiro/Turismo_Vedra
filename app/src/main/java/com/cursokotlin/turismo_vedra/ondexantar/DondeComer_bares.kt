package com.cursokotlin.turismo_vedra.ondexantar

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.cursokotlin.turismo_vedra.R

class DondeComer_bares : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donde_comer_bares)

        val botonderbi = findViewById<ImageButton>(R.id.botonderbi)
        botonderbi.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?rlz=1C1VDKB_esES993ES993&sxsrf=ALiCzsZddg5d-UlWUxHtU8lXAeqT-0hfxA:1656675934089&q=derbi+bar+vedra&sa=X&ved=2ahUKEwiYq7zkztf4AhWtyYUKHS2iC4cQ7xYoAHoECAEQOA&biw=957&bih=951&dpr=1")))
        }

        val botonferrador = findViewById<ImageButton>(R.id.botonferrador)
        botonferrador.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=taberna+do+ferrador&rlz=1C1VDKB_esES993ES993&biw=957&bih=951&sxsrf=ALiCzsbT3pdEFFzX0rOeje3OJAhD9s9c_w%3A1656675936530&ei=YN6-YsiAIIj8a5fEg8AI&ved=0ahUKEwjIsNHlztf4AhUI_hoKHRfiAIgQ4dUDCA4&uact=5&oq=taberna+do+ferrador&gs_lcp=Cgdnd3Mtd2l6EAMyCwguEIAEEMcBEK8BMgYIABAeEBYyBggAEB4QFjIGCAAQHhAWMgYIABAeEBYyBggAEB4QFjIGCAAQHhAWMgYIABAeEBYyBggAEB4QFjICCCY6BAgjECc6CwgAEIAEELEDEIMBOhEILhCABBCxAxCDARDHARDRAzoECAAQQzoNCC4QxwEQ0QMQ1AIQQzoICC4QgAQQ1AI6CgguEMcBEK8BEEM6CAgAEIAEELEDOg4IABCABBCxAxCDARDJAzoOCC4QgAQQsQMQgwEQ1AI6CAgAELEDEIMBOgcIABCxAxBDOhEILhCABBCxAxCDARDHARCvAToFCAAQgAQ6BQgAEMsBOgsILhDHARCvARDLAToICAAQHhAWEApKBAhBGABKBAhGGABQAFiKEmDyEmgAcAB4AIABqAKIAb4YkgEGMC4xMi42mAEAoAEBwAEB&sclient=gws-wiz")))
        }
    }
}