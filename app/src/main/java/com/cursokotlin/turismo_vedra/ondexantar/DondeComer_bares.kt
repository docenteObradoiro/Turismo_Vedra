package com.cursokotlin.turismo_vedra.ondexantar

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.HorizontalScrollView
import android.widget.ImageButton
import com.cursokotlin.turismo_vedra.R

class DondeComer_bares : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donde_comer_bares)

        /*codigo para ocultar a barra do scroll lateral*/
        val scrollvedra: HorizontalScrollView = findViewById(R.id.scrollvedra)
        scrollvedra.isHorizontalScrollBarEnabled = false
        val scrollsantacruz: HorizontalScrollView = findViewById(R.id.scrollsantacruz)
        scrollsantacruz.isHorizontalScrollBarEnabled = false
        val scrollsanfins: HorizontalScrollView = findViewById(R.id.scrollsanfins)
        scrollsanfins.isHorizontalScrollBarEnabled = false

        val botonderbi = findViewById<ImageButton>(R.id.botonderbi)
        botonderbi.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?rlz=1C1VDKB_esES993ES993&sxsrf=ALiCzsZddg5d-UlWUxHtU8lXAeqT-0hfxA:1656675934089&q=derbi+bar+vedra&sa=X&ved=2ahUKEwiYq7zkztf4AhWtyYUKHS2iC4cQ7xYoAHoECAEQOA&biw=957&bih=951&dpr=1")))
        }
        val botonferrador = findViewById<ImageButton>(R.id.botonferrador)
        botonferrador.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=taberna+do+ferrador&rlz=1C1VDKB_esES993ES993&biw=957&bih=951&sxsrf=ALiCzsbT3pdEFFzX0rOeje3OJAhD9s9c_w%3A1656675936530&ei=YN6-YsiAIIj8a5fEg8AI&ved=0ahUKEwjIsNHlztf4AhUI_hoKHRfiAIgQ4dUDCA4&uact=5&oq=taberna+do+ferrador&gs_lcp=Cgdnd3Mtd2l6EAMyCwguEIAEEMcBEK8BMgYIABAeEBYyBggAEB4QFjIGCAAQHhAWMgYIABAeEBYyBggAEB4QFjIGCAAQHhAWMgYIABAeEBYyBggAEB4QFjICCCY6BAgjECc6CwgAEIAEELEDEIMBOhEILhCABBCxAxCDARDHARDRAzoECAAQQzoNCC4QxwEQ0QMQ1AIQQzoICC4QgAQQ1AI6CgguEMcBEK8BEEM6CAgAEIAEELEDOg4IABCABBCxAxCDARDJAzoOCC4QgAQQsQMQgwEQ1AI6CAgAELEDEIMBOgcIABCxAxBDOhEILhCABBCxAxCDARDHARCvAToFCAAQgAQ6BQgAEMsBOgsILhDHARCvARDLAToICAAQHhAWEApKBAhBGABKBAhGGABQAFiKEmDyEmgAcAB4AIABqAKIAb4YkgEGMC4xMi42mAEAoAEBwAEB&sclient=gws-wiz")))
        }
        val botonesther = findViewById<ImageButton>(R.id.botonesther)
        botonesther.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?gs_ssp=eJzj4tVP1zc0TM6pNCk3ibcwYLRSMahIMUpLtExMNjFMM7e0TDa0MqgwN04xMjFNSklOTjE3SE0z8pLIVyjKzEvOz1NISVVILS7JSC1SKEtNKUoEAJijGHU&q=o+rincon+de+esther+vedra&rlz=1C1VDKB_esES993ES993&oq=o+rincon+de+es&aqs=chrome.1.69i57j46i175i199i512j0i22i30.3117j0j7&sourceid=chrome&ie=UTF-8")))
        }
        val botonmosqueiro= findViewById<ImageButton>(R.id.botonmosqueiro)
        botonmosqueiro.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=taberna+de+mosqueiro+vedra&rlz=1C1VDKB_esES993ES993&sxsrf=ALiCzsYo8Ej8pTCMfPlO4kdhasosflRovA%3A1656914860247&ei=rIPCYvPWDpaNaNKNmqgM&ved=0ahUKEwjz3KvtyN74AhWWBhoKHdKGBsUQ4dUDCA4&uact=5&oq=taberna+de+mosqueiro+vedra&gs_lcp=Cgdnd3Mtd2l6EAMyAggmOg4ILhCABBDHARCvARCwAzoGCAAQHhAWSgQIQRgBSgQIRhgAUJEBWJcPYM4TaAFwAHgAgAF-iAHWBZIBAzAuNpgBAKABAcgBAcABAQ&sclient=gws-wiz")))
        }
        val botonpatio = findViewById<ImageButton>(R.id.botonopatio)
        botonpatio.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?sa=X&rlz=1C1VDKB_esES993ES993&sxsrf=ALiCzsbTxh7L2WZgKm1A-giPXoyOAfN5xQ:1656914967805&q=bar+o+patio+vedra&ved=2ahUKEwjFxtCgyd74AhWJw4UKHRdcCnQQuzF6BAgBEAI&biw=957&bih=951&dpr=1")))
        }
        val botonquenllas = findViewById<ImageButton>(R.id.botonquenllas)
        botonquenllas.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=quenllas+vedra&rlz=1C1VDKB_esES993ES993&sxsrf=ALiCzsYq6_N6ptaKtt4QK7XScw3UcmXYew%3A1656913705501&ei=KX_CYpiXHtGNlwTQkZLABQ&hotel_occupancy=2&oq=quenll&gs_lcp=Cgdnd3Mtd2l6EAEYADIECCMQJzIFCC4QgAQyCwguEIAEEMcBEK8BMgsILhCABBDHARCvATILCC4QgAQQxwEQrwEyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDoOCC4QgAQQxwEQrwEQsAM6CAguEIAEENQCOgsIABCABBCxAxCDAToICAAQsQMQgwE6BAgAEEM6CwguEIAEELEDEIMBOhQILhCABBCxAxCDARDHARCvARDUAjoICC4QsQMQgwE6EQguEIAEELEDEIMBEMcBEK8BOgcIABCABBAKSgQIQRgBSgQIRhgAUKsIWP8VYO0daANwAHgAgAHgAYgBuwaSAQUwLjUuMZgBAKABAcgBAcABAQ&sclient=gws-wiz")))
        }
        val botongundian = findViewById<ImageButton>(R.id.botongundian)
        botongundian.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=taberna+de+gundian&rlz=1C1VDKB_esES993ES993&sxsrf=ALiCzsaSN1m0ObmAKKkFODxBuwW4f4OLtQ%3A1656914756748&ei=RIPCYvGFLe2KlwTU8qr4BQ&hotel_occupancy=2&ved=0ahUKEwjxt_67yN74AhVtxYUKHVS5Cl8Q4dUDCA4&uact=5&oq=taberna+de+gundian&gs_lcp=Cgdnd3Mtd2l6EANKBAhBGAFKBAhGGABQggVYuxlgpxxoAnAAeACAAZYBiAGWAZIBAzAuMZgBAKABAcABAQ&sclient=gws-wiz")))
        }
        val botonterraza = findViewById<ImageButton>(R.id.botonterraza)
        botonterraza.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=a+terraza+vedra&rlz=1C1VDKB_esES993ES993&sxsrf=ALiCzsb0mQ2As1ji80DSVa5uyV-AbpPb2g%3A1656914964522&ei=FITCYpLHH4zaafyTmvAL&ved=0ahUKEwiSoYifyd74AhUMbRoKHfyJBr4Q4dUDCA4&uact=5&oq=a+terraza+vedra&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECc6BQguEIAEOgYIABAeEAc6CAgAEB4QBxAFOgYIABAeEAg6CAgAEB4QCBAKSgQIQRgASgQIRhgAUABY5wpgpBRoAHAAeACAAfQBiAGDCpIBBTAuNy4ymAEAoAEBwAEB&sclient=gws-wiz")))
        }
        val botonheba = findViewById<ImageButton>(R.id.botonheba)
        botonheba.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=heba44&rlz=1C1VDKB_esES993ES993&oq=heba44&aqs=chrome..69i57j46i13i175i199.2647j0j4&sourceid=chrome&ie=UTF-8")))
        }
        val botonavo = findViewById<ImageButton>(R.id.botonavo)
        botonavo.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=fogar+do+avo&rlz=1C1VDKB_esES993ES993&sxsrf=ALiCzsZwJaUmMT_uRvWBfnG51bDsWZXGCg%3A1656914016346&ei=YIDCYo7WFJL8a4Wlg4gE&ved=0ahUKEwiOhvjaxd74AhUS_hoKHYXSAEEQ4dUDCA4&uact=5&oq=fogar+do+avo&gs_lcp=Cgdnd3Mtd2l6EAMyCwguEIAEEMcBEK8BMgYIABAeEBYyBggAEB4QFjICCCY6DQguEMcBEK8BELADEA06BAgjECc6EQguEIAEELEDEIMBEMcBENEDOgsILhCABBCxAxCDAToLCAAQgAQQsQMQgwE6BQguEIAEOhEILhCABBCxAxCDARDHARCjAjoFCAAQgAQ6CAgAEIAEELEDOgoIABCxAxCDARAKOgoILhDHARCvARAKOgQIABAKOgcIABCxAxAKOgcIABCABBAKSgQIQRgBSgQIRhgAUPcJWKkzYO40aAZwAHgAgAGZAYgB3w-SAQQwLjE1mAEAoAEByAEBwAEB&sclient=gws-wiz")))
        }
        val botonbarreiro = findViewById<ImageButton>(R.id.botonbarreiro)
        botonbarreiro.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=bar+barreiro+d%27barcia&rlz=1C1VDKB_esES993ES993&sxsrf=ALiCzsZ2meL_WPnwCXoLNDnQwEZ6GXWd9g%3A1656914033420&ei=cYDCYrGcGYbHlwSK0664CQ&ved=0ahUKEwjxmIrjxd74AhWG44UKHYqpC5cQ4dUDCA4&uact=5&oq=bar+barreiro+d%27barcia&gs_lcp=Cgdnd3Mtd2l6EAMyBwghEAoQoAEyBwghEAoQoAEyBwghEAoQoAE6BAgjECc6BggjECcQEzoRCC4QgAQQsQMQgwEQxwEQowI6CwgAEIAEELEDEIMBOgUIABCABDoECC4QQzoOCC4QsQMQgwEQxwEQrwE6CwguEIAEELEDENQCOgsILhCABBDHARCvAToGCAAQHhAWOgcIIxCwAhAnSgQIQRgASgQIRhgAUABY9y5g5S9oAHAAeAKAAbAHiAG7GJIBCzAuOS4wLjEuNi0ymAEAoAEBwAEB&sclient=gws-wiz")))
        }
        val botonrey = findViewById<ImageButton>(R.id.botonrey)
        botonrey.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=bar+rey+vedra&rlz=1C1VDKB_esES993ES993&sxsrf=ALiCzsYHamejBkGnO5I8-dEhg_d5R0L8jA%3A1656914072812&ei=mIDCYoyaMZD4a8-ercgK&oq=bar+rey+&gs_lcp=Cgdnd3Mtd2l6EAEYADIECCMQJzILCC4QgAQQxwEQrwEyCwguEIAEEMcBEK8BMgUIABCABDIFCAAQgAQyCwguEIAEEMcBEK8BMgUIABCABDILCC4QgAQQxwEQrwEyCwguEIAEEMcBEK8BMgUIABCABDoKCAAQsQMQgwEQQzoECAAQQzoECC4QQzoICC4QgAQQsQM6CAgAEIAEEMkDOgoILhCABBCHAhAUOhAILhCABBCHAhDHARCvARAUOgcIABCABBAKSgQIQRgASgQIRhgAULwDWLIKYKcOaABwAHgAgAG6AYgBkAaSAQMxLjSYAQCgAQHAAQE&sclient=gws-wiz")))
        }
        val botonsouto = findViewById<ImageButton>(R.id.botonsouto)
        botonsouto.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=A+Taberna+do+Souto+vedra&rlz=1C1VDKB_esES993ES993&sxsrf=ALiCzsZ6ua7jshND_iWftMEyiB53Eh808w%3A1656914135723&ei=14DCYsnfK8WIaaekjvAI&ved=0ahUKEwiJp-6Txt74AhVFRBoKHSeSA44Q4dUDCA4&uact=5&oq=A+Taberna+do+Souto+vedra&gs_lcp=Cgdnd3Mtd2l6EAMyCgguEMcBEK8BEBMyAggmSgQIQRgASgQIRhgAUABYAGCWBmgAcAF4AIABf4gBf5IBAzAuMZgBAKABAqABAcABAQ&sclient=gws-wiz")))
        }
        val botonvicky = findViewById<ImageButton>(R.id.botonvicky)
        botonvicky.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Cafe+Bar+Vicky+vedra&rlz=1C1VDKB_esES993ES993&sxsrf=ALiCzsY7k0Rtv2EZLzSdUypK0yCrEe2RNw%3A1656914160493&ei=8IDCYqPOHcz_lwTtl62gBQ&ved=0ahUKEwijhtafxt74AhXM_4UKHe1LC1QQ4dUDCA4&uact=5&oq=Cafe+Bar+Vicky+vedra&gs_lcp=Cgdnd3Mtd2l6EAMyAggmSgQIQRgASgQIRhgAUABYAGCmBmgAcAB4AIABe4gBe5IBAzAuMZgBAKABAqABAcABAQ&sclient=gws-wiz")))
        }
    }
}