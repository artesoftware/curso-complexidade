package br.com.artesoftware.cursocomplexidade

import java.io.File

class CognitivaRegra1 {

    fun  metodoComIf( s: String?) {
        if (s != null){
            println("Tamanho de S=" + s.length)
        }
    }

    fun  metodoSemIf( s: String?) {
        println("Tamanho de S=" + s?.length)
    }

}