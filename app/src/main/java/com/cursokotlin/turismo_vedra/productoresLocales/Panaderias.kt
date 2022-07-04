package com.cursokotlin.turismo_vedra.productoresLocales

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.cursokotlin.turismo_vedra.InformacionTuristica
import com.cursokotlin.turismo_vedra.MainActivity
import com.cursokotlin.turismo_vedra.Menu
import com.cursokotlin.turismo_vedra.R

class Panaderias : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panaderias)

        var logoVedra=findViewById<ImageButton>(R.id.logoVedra)
        logoVedra.setOnClickListener {
            val acceder= Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }
        var menu=findViewById<ImageButton>(R.id.menuHamburguesa)
        menu.setOnClickListener {
            val acceder= Intent(this, Menu::class.java)
            startActivity(acceder)
        }
        var fornoDeSanXian=findViewById<ImageButton>(R.id.fornoSanXian)
        fornoDeSanXian.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=forno+de+san+xian&rlz=1C1CHBF_esES993ES993&oq=forno+de+sa&aqs=chrome.0.0i355i512j46i175i199i512j0i512j69i57j0i512j46i175i199i512j0i512l4.3351j0j7&sourceid=chrome&ie=UTF-8")))
        }
        var fornoDaUlla=findViewById<ImageButton>(R.id.oFornoDaUlla)
        fornoDaUlla.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=forno+da+ulla&rlz=1C1CHBF_esES993ES993&oq=forno+da+ulla&aqs=chrome..69i57j46i175i199i512.2968j0j9&sourceid=chrome&ie=UTF-8")))
        }
        var enfornalia=findViewById<ImageButton>(R.id.enfornalia)
        enfornalia.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=enfornalia&rlz=1C1CHBF_esES993ES993&oq=enfornalia&aqs=chrome..69i57j0i546l2.1687j0j9&sourceid=chrome&ie=UTF-8")))
        }
        var oTerron=findViewById<ImageButton>(R.id.oTerron)
        oTerron.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=o+terron+vedra&rlz=1C1CHBF_esES993ES993&oq=o+terron+vedra&aqs=chrome..69i57j0i22i30.4943j0j9&sourceid=chrome&ie=UTF-8")))
        }
        var raviña=findViewById<ImageButton>(R.id.raviña)
        raviña.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?gs_ssp=eJzj4tVP1zc0TC4uysjOLjM0YLRSMahIMUpLtExLNTA3MTIwMEyyMqhITUxLS0tOM04yNkpKNjcz8BIsSMxLTEktykxUKEosyzy8MREAHHwXag&q=panaderia+ravi%C3%B1a&rlz=1C1CHBF_esES993ES993&oq=panderia+ravi&aqs=chrome.1.69i57j46i13i175i199.5862j0j9&sourceid=chrome&ie=UTF-8")))
        }
        var rey=findViewById<ImageButton>(R.id.rey)
        rey.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=panaderia+rey&rlz=1C1CHBF_esES993ES993&sxsrf=ALiCzsZidJqtz6Omx6emq-l4KoAWMU2Zzw%3A1656659909191&ei=xZ--Yo2nC8zeao6ijNAI&ved=0ahUKEwjNnZqLk9f4AhVMrxoKHQ4RA4oQ4dUDCA4&uact=5&oq=panaderia+rey&gs_lcp=Cgdnd3Mtd2l6EAMyCwguEIAEEMcBEK8BMgUIABCABDIFCAAQgAQyEAguEIAEEIcCEMcBEK8BEBQyBQgAEIAEMgsILhCABBDHARCvATILCC4QgAQQxwEQrwEyCwguEIAEEMcBEK8BMgsILhCABBDHARCvATILCC4QgAQQxwEQrwE6EwguEIAEEIcCEMcBEK8BELADEBRKBAhBGAFKBAhGGABQjwRY5gZglQpoAXAAeACAAasBiAG5ApIBAzAuMpgBAKABAcgBAcABAQ&sclient=gws-wiz")))
        }
        var victoria=findViewById<ImageButton>(R.id.victoria)
        victoria.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=panaderia+victoria&rlz=1C1CHBF_esES993ES993&sxsrf=ALiCzsZXwIzh0LraL3C5EbpfQcDDrW-8xA%3A1656659926568&ei=1p--YsmjIo34lwT41LnQCA&oq=panaderia+v&gs_lcp=Cgdnd3Mtd2l6EAEYADIECCMQJzIQCC4QgAQQhwIQxwEQrwEQFDILCC4QgAQQxwEQrwEyBQgAEIAEMgsILhCABBDHARCvATIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyEAguEIAEEIcCEMcBEK8BEBQ6CAgAEIAEELADOg4ILhCABBDHARCvARCwAzoTCC4QgAQQxwEQrwEQyAMQsAMYAUoECEEYAUoECEYYAVCMBFiMBGCeDGgBcAB4AIABoQGIAaEBkgEDMC4xmAEAoAEByAETwAEB2gEGCAEQARgI&sclient=gws-wiz")))
        }
        var infoTuristica=findViewById<TextView>(R.id.tvInformacionTuristica)
        infoTuristica.setOnClickListener {
                val acceder = Intent(this, InformacionTuristica::class.java)
                startActivity(acceder)
        }
        var webConcello =findViewById<TextView>(R.id.tvWebVedra)
        webConcello.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/es")))
        }
    }
}