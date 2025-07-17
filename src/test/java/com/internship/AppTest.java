package com.internship;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
    
    private Problems instancia;

    @Before
    public void setUp() {
        instancia = new Problems();
    }
    
    @Test
    public void testSumaDeDigitos_1() {
        int[] numeros = {9, 9, 9}; 
        int esperado = 27;
        assertEquals(esperado, instancia.sumaDeDigitos(numeros));
    }

     @Test
    public void testSumaDeDigitos_2() {
        int[] numeros = {9,1,8,4,5,0,1}; 
        int esperado = 28;
        assertEquals(esperado, instancia.sumaDeDigitos(numeros));
    }

     @Test
    public void testSumaDeDigitos_3() {
        int[] numeros = {1,2,3,4,5}; 
        int esperado = 15;
        assertEquals(esperado, instancia.sumaDeDigitos(numeros));
    }

    @Test
    public void palindromo_1() {
        String palabra = "aabaa";
        boolean esperado = true;
        assertEquals(esperado, instancia.palindromo(palabra));
    }

     @Test
    public void palindromo_2() {
        String palabra = "abac";
        boolean esperado = false;
        assertEquals(esperado, instancia.palindromo(palabra));
    }

     @Test
    public void palindromo_3() {
        String palabra = "salas";
        boolean esperado = true;
        assertEquals(esperado, instancia.palindromo(palabra));
    }

     @Test
    public void ordenamiento_1() {
        int[] numeros = {5, -2, 10, 0, 3}; 
        int[] esperado = {-2, 0, 3, 5, 10};
        assertArrayEquals(esperado, instancia.ordenamiento(numeros));
    }

     @Test
    public void ordenamiento_2() {
        int[] numeros = {1,2,3,-6,9}; 
        int[] esperado = {-6, 1, 2, 3, 9};
        assertArrayEquals(esperado, instancia.ordenamiento(numeros));
    }

     @Test
    public void ordenamiento_3() {
        int[] numeros = {1,2,3,4,5}; 
        int[] esperado = {1,2,3,4,5};
        assertArrayEquals(esperado, instancia.ordenamiento(numeros));
    }
}
