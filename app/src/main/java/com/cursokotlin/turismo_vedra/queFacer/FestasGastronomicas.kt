package com.cursokotlin.turismo_vedra.queFacer

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ExpandableListAdapter
import android.widget.ExpandableListView
import android.widget.TextView
import com.cursokotlin.turismo_vedra.R

class FestasGastronomicas : AppCompatActivity() {
    private var expandableListView2: ExpandableListView? = null
    private var adapter2: ExpandableListAdapter? = null
    private var titleList2: List<String>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_festas_gastronomicas)
        title = "KotlinApp"
        expandableListView2 = findViewById(R.id.expendableList2)
        if (expandableListView2 != null) {
            val listData2 = ExpandableListData2.listaFestasGastro
            titleList2 = ArrayList(listData2.keys)
            adapter2 = CustomExpandableListAdapter(this, titleList2 as ArrayList<String>, listData2)
            expandableListView2!!.setAdapter(adapter2)

        }
        val infoTuristica=findViewById<TextView>(R.id.tvInformacionTuristica)
        infoTuristica.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/es/node/459")))
        }

        val webConcello =findViewById<TextView>(R.id.tvWebVedra)
        webConcello.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.concellodevedra.es/es")))
        }
    }
}