package com.teste;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTeste {
    @Test
    public void testeSomar() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar("1+1+3");
        assertEquals(5,soma);
    }
}
