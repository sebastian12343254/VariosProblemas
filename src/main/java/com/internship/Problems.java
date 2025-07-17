package com.internship;

public class Problems {

    public int sumaDeDigitos(int[] numeros) {
       int sumaTotal = 0;

       for (int numero : numeros) {
            sumaTotal += numero;
        }
       return sumaTotal;
    }

    public boolean palindromo(String resultado) {
        for(int i = 0; i < resultado.length() / 2; i++) {
            if(resultado.charAt(i) == resultado.charAt(resultado.length() - 1 - i)) {
                return true;
            } 
        } return false;
    }

    public int[] ordenamiento(int[] numeros) {
    int n = numeros.length;
    for (int i = 1; i < n; i++) {
        int clave = numeros[i];
        int j = i - 1;
        while (j >= 0 && numeros[j] > clave) {
            numeros[j + 1] = numeros[j];
            j--;
        }
        numeros[j + 1] = clave;
    }
    return numeros;
    }
}
