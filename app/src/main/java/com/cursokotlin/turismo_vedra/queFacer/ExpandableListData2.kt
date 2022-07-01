package com.cursokotlin.turismo_vedra.queFacer

import kotlin.collections.ArrayList
import kotlin.collections.LinkedHashMap

internal object ExpandableListData2 {
    val listaFestasGastro: LinkedHashMap<String, List<String>>
        get() {
            val expandableListDetail2 =
                LinkedHashMap<String, List<String>>()

            val festasGastroAbril: MutableList<String> =
                ArrayList()
            festasGastroAbril.add("A Exaltación do viño da Ulla, no mes de abril en San Miguel de Sarandón.")

            val festasGastroMaio: MutableList<String> =
                ArrayList()
            festasGastroMaio.add("A festa da Orella de Porco, no mes de maio en San Fins de Sales.")
            festasGastroMaio.add("A Festa do Porco á Brasa, no mes de maio en Trobe ")
            festasGastroMaio.add("A Festa do Carneiro ó espeto, no mes de maio en San Xián de Sales")
            festasGastroMaio.add("Fiesta de la Aguardiente, en el mes de mayo en San Mamede de Ribadulla.")


            val festasGastroXul: MutableList<String> =
                ArrayList()
            festasGastroXul.add("A Festa do Escalo, no mes de xullo en Santa Cruz de Ribadulla.")


            expandableListDetail2["Abril"] = festasGastroAbril
            expandableListDetail2["Maio"] = festasGastroMaio
            expandableListDetail2["Xullo"] = festasGastroXul

            return expandableListDetail2
        }
}