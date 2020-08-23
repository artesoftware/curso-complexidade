package br.com.artesoftware.cursocomplexidade

class CognitivaRegra3Kotlin {

    fun divide(dividendo: Int?, divisor: Int?): Int {
        checkNotNull(dividendo, {"Dividendo nulo!"});
        checkNotNull(divisor, {"Divisor nulo!"});
        check(divisor == 0, {"Divisão Zero!"})
        return dividendo / divisor
    }

}