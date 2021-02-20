package com.teste;

import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class AssertTeste {
    @Test
    public void testeAssertArrayEquals() {
        byte[] esperado = "teste".getBytes();
        byte[] atual    = "teste".getBytes();
        assertArrayEquals(esperado, atual);
    }


    @Test
    public void testeAssertEquals() {
        assertEquals("text", "text");
    }

    @Test
    public void testeAssertFalse() {
        assertFalse(false);
    }

    @Test
    public void testeAssertNotNull() {
        assertNotNull(new Object());
    }

    @Test
    public void testeAssertNotSame() {
        assertNotSame(new Object(), new Object());
    }

    @Test
    public void testeAssertNull() {
        assertNull(null);
    }

    //@Test
    //public void testeAssertSame() {
     //   Integer
    //}
}
