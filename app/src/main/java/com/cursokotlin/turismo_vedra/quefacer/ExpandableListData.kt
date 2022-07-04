package com.cursokotlin.turismo_vedra.quefacer

import kotlin.collections.ArrayList
import kotlin.collections.LinkedHashMap

internal object ExpandableListData {
    val data: LinkedHashMap<String, List<String>>
        get() {
            val expandableListDetail =
                LinkedHashMap<String, List<String>>()

            val festasXaneiro: MutableList<String> =
                ArrayList()
            festasXaneiro.add("Festas Patronais a primeira fin de semana despois do día de Reis en San Xián de Sales.")

            val festasFebreiro: MutableList<String> =
                ArrayList()
            festasFebreiro.add("Ceremonia das Candeas o 2 de febreiro en San Pedro de Sarandon")
            festasFebreiro.add("San Blas o domingo seguinte ó 3 de febreiro en San Mamede de Ribadulla")

            val festasMarzo: MutableList<String> =
                ArrayList()
            festasMarzo.add("Non hai contido")


            val festasAbril: MutableList<String> =
                ArrayList()
            festasAbril.add("Virxe das Angustias o domingo de Pascua en Illobre")

            val festasMaio: MutableList<String> =
                ArrayList()
            festasMaio.add("San Pedro Mártir o domingo seguinte ó 29 de abril en Merin.")
            festasMaio.add("Santa Cruz o 3 de maio en Santa Cruz de Ribadulla.")

            val festasXuno: MutableList<String> =
                ArrayList()
            festasXuno.add("Santísimo en San Xián de Sales")
            festasXuno.add("Santa Isabel o segundo domingo despois de Corpus en San Fins de Sales.")
            festasXuno.add("San Pedro o 29 e 30 de xuño en San Pedro de Sarandon.")
            festasXuno.add("S. Pedro a primeira fin de semana tralo 29 dese mes en San Pedro de Vilanova.")

            val festasXul: MutableList<String> =
                ArrayList()
            festasXul.add("Concepción o primeiro domingo de xullo en San Pedro de Sarandon.")
            festasXul.add("San Cristovo o primeiro domingo despois do 10 de xullo en Merin.")
            festasXul.add("Festas da Madalena o 22 e 23 de xullo en A Ponte Ulla")

            val festasAgo: MutableList<String> =
                ArrayList()
            festasAgo.add("Festas Patronais o 1, 2 e 3 de agosto en San Fins de Sales.")
            festasAgo.add("Festas Patronais o 7 e 8 de agosto en San Mamede de Ribadulla.")
            festasAgo.add("San Campio o  9, 10 e 11 de agosto en San Miguel de Sarandon.")
            festasAgo.add("Santiaguiño o sábado anterior ó último domingo de agosto en San Pedro de Vilanova.")
            festasAgo.add("Romaría dos Remedios o derradeiro domingo de agosto en Trobe")

            val festasSet: MutableList<String> =
                ArrayList()
            festasSet.add("As Dores o primeiro domingo de setembro en Vedra")
            festasSet.add("Romaría do Gundián-Procesión e Fogos de artificio o 7 e 8  de setembro en A Ponte Ulla")
            festasSet.add("Romaría do Patio o luns despois do terceiro domingo de setembro en Santa Cruz de Ribadulla.")
            festasSet.add("San Miguel o 29 de setembro en San Miguel de Sarandon.")

            val festasOutubro: MutableList<String> =
                ArrayList()
            festasOutubro.add("Non hai contido")

            val festasNov: MutableList<String> =
                ArrayList()
            festasNov.add("Santo André o 30 de novembro en Illobre")

            val festasDec: MutableList<String> =
                ArrayList()
            festasDec.add("Santa Baia o 10 de decembro en Vedra")

            expandableListDetail["Xaneiro"] = festasXaneiro
            expandableListDetail["Febreiro"] = festasFebreiro
            expandableListDetail["Marzo"] = festasMarzo
            expandableListDetail["Abril"] = festasAbril
            expandableListDetail["Maio"] = festasMaio
            expandableListDetail["Xuño"] = festasXuno
            expandableListDetail["Xullo"] = festasXul
            expandableListDetail["Agosto"] = festasAgo
            expandableListDetail["Setembro"] = festasSet
            expandableListDetail["Outubro"] = festasOutubro
            expandableListDetail["Novembro"] = festasNov
            expandableListDetail["Decembro"] = festasDec
            return expandableListDetail
        }
}
