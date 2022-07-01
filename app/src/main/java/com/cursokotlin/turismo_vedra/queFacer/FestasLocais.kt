package com.cursokotlin.turismo_vedra.queFacer

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ExpandableListAdapter
import android.widget.ExpandableListView
import android.widget.TextView
import com.cursokotlin.turismo_vedra.queFacer.ExpandableListData.data
import com.cursokotlin.turismo_vedra.R

class FestasLocais : AppCompatActivity() {
private var expandableListView: ExpandableListView? = null
private var adapter: ExpandableListAdapter? = null
private var titleList: List<String>? = null
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_festas_locais)
    title = "KotlinApp"
    expandableListView = findViewById(R.id.expendableList)
    if (expandableListView != null) {
        val listData = data
        titleList = ArrayList(listData.keys)
        adapter = CustomExpandableListAdapter(this, titleList as ArrayList<String>, listData)
        expandableListView!!.setAdapter(adapter)

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