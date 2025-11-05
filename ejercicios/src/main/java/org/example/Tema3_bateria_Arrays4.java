package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tema3_bateria_Arrays4 {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        int[] vector = {1, 2, 3, 4, 5};
        int[] filtrado = new int[vector.length-1];

        System.out.println("Ingresa la posicion que quieres eliminar:");

        int usuario = teclado.nextInt();

        for (int i = 0; i < filtrado.length; i++) {

            if (i >= usuario) {
                filtrado[i] = vector[i+1];
            }else {
                filtrado[i] = vector[i];
            }
        }
        System.out.println(Arrays.toString(filtrado));
    }
}
