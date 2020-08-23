package br.com.artesoftware.cursocomplexidade;

import org.junit.jupiter.api.Test;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContadorRefatorado2Test {

    @Test
    public void contar() {
        ContadorRefatorado2 contador = new ContadorRefatorado2();
        // Retorna -1 - parâmetro que não faz contagem
        assertEquals(-1, contador.contar(null));
        assertEquals(-1, contador.contar(List.class));
        assertEquals(-1, contador.contar(Month.class));
        // Object não tem nenhuma constante inteira
        assertEquals(0, contador.contar(Object.class));
        // ArrayList tem 4 constantes inteiras
        assertEquals(4, contador.contar(ArrayList.class));
    }
}