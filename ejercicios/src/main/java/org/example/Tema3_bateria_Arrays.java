package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tema3_bateria_Arrays {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int vector[] = new int[8];
        int suma = 0;

        for (int i = 0; i < vector.length; i++) {

            vector[i] = aleatorio.nextInt(501);
            suma += vector[i] ;
        }
        System.out.println(suma);

    }
}
