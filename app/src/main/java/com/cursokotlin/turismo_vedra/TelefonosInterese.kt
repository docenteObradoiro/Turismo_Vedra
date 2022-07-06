package com.cursokotlin.turismo_vedra

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ExpandableListAdapter
import android.widget.ExpandableListView
import android.widget.ImageButton
import android.widget.TextView


class TelefonosInterese : AppCompatActivity() {
    private var expandableListViewTelefonos: ExpandableListView? = null
    private var adapter: ExpandableListAdapter? = null
    private var titleList: List<String>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telefonos_interese)


        var logoVedra=findViewById<ImageButton>(R.id.logoVedra)
        logoVedra.setOnClickListener {
            val acceder= Intent(this, MainActivity::class.java)
            startActivity(acceder)
        }

        var menu = findViewById<ImageButton>(R.id.menuHamburguesa)
        menu.setOnClickListener {
            val acceder = Intent(this, Menu::class.java)
            startActivity(acceder)
        }

        title = "KotlinApp"
        expandableListViewTelefonos = findViewById(R.id.expendableListTelefonos)
        if (expandableListViewTelefonos != null) {
            val listData = ExpandableListDataTelefonos.data
            titleList = ArrayList(listData.keys)
            adapter = CustomExpandableListAdapterTelefonos(this, titleList as ArrayList<String>, listData)
            expandableListViewTelefonos!!.setAdapter(adapter)

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