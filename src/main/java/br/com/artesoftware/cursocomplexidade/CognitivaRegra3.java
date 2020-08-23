package br.com.artesoftware.cursocomplexidade;

public class CognitivaRegra3 {

    public int dividir(Integer dividendo, Integer divisor){
        if (dividendo != null) {
            if (divisor != null) {
                if (divisor == 0){
                    throw new RuntimeException("Divisão Zero!");
                } else {
                    return dividendo / divisor;
                }
            }
        }
        throw new RuntimeException("Divisão impossível!");
    }

    public int divide(Integer dividendo, Integer divisor){
        if (dividendo == null){
            throw new NullPointerException("Dividendo nulo!");
        }
        if (divisor == null){
            throw new NullPointerException("Divisor nulo!");
        }
        if (divisor == 0){
            throw new RuntimeException("Divisão Zero!");
        }
        return dividendo / divisor;
    }
}
