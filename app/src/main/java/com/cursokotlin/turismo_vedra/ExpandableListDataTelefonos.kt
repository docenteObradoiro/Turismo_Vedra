package com.cursokotlin.turismo_vedra

import java.util.*
internal object           ExpandableListDataTelefonos {
    val data: LinkedHashMap<String, List<String>>
        get() {
            val expandableListDetail =
                LinkedHashMap<String, List<String>>()

            val myConcello: MutableList<String> =
                ArrayList()
            myConcello.add("981814612")

            val myEmergencias: MutableList<String> = ArrayList()
            myEmergencias.add("Protección civil    629661685")
            myEmergencias.add("Garda Civil    981503051")
            myEmergencias.add("Emerxencias    112")

            val myMedicos: MutableList<String> = ArrayList()
            myMedicos.add("Centro de Saúde de Vedra    981503111")
            myMedicos.add("Farmacia de Vedra    981503233")
            myMedicos.add("Farmacia de Santa Cruz    981512314")

            val myLudicos: MutableList<String> = ArrayList()
            myLudicos.add("Biblioteca de Vedra    981502262")
            myLudicos.add("Axencia de Lectura de Santa Cruz    981512242")
            myLudicos.add("Pavillón Municipal de Deportes    981502290")

            val myServicio: MutableList<String> = ArrayList()
            myServicio.add("Ponte Ulla    981512026")

            val myTransportes: MutableList<String> = ArrayList()
            myTransportes.add("Estación de autobuses de Santiago    981542416")
            myTransportes.add("Monbús    902292900")
            myTransportes.add("Empresa de autocares Seoane    981562832")
            myTransportes.add("Aeroporto de Lavacolla    981547500")
            myTransportes.add("Estación de tren de Santiago    902240202")
            myTransportes.add("Taxi nº2    981503152")
            myTransportes.add("Taxi nº3    608981944")
            myTransportes.add("Taxi nº4    606434349")
            myTransportes.add("Taxi nº10    659187639")

            expandableListDetail["CONCELLO DE VEDRA"] = myConcello
            expandableListDetail["SERVIZOS DE EMERXENCIAS"] = myEmergencias
            expandableListDetail["SERVIZOS MÉDICOS"] = myMedicos
            expandableListDetail["SERVIZOS LÚDICOS"] = myLudicos
            expandableListDetail["ESTACIÓN DE SERVIZO"] = myServicio
            expandableListDetail["TRANSPORTES"] = myTransportes
            return expandableListDetail
        }
}