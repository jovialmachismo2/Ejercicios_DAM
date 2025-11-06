package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Tema3_bateria_Arrays5 {
    static void main() {


        int[] vector = {1, 2, 3, 4, 5, 6, 8, 9};
        int[] filtrado = new int[vector.length];
        int aux = vector[vector.length-1];

        for (int i = 0; i < filtrado.length; i++) {
            if (i == 0){
                filtrado[0] = aux;
            }else{
                filtrado[i] = vector[i-1];
            }

        }
        System.out.println(Arrays.toString(filtrado));
    }
}
