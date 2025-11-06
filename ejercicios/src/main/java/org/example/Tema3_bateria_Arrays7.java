package org.example;

import java.util.Arrays;

public class Tema3_bateria_Arrays7 {
    static void main() {
        int[] vector = {1, 2, 3,4};
        int[] vector2 = {4, 5, 6,7};
        int[] filtrado = new int[vector.length+ vector2.length];
        int i = 0;

        for (i = 0; i < vector.length ; i++) {

            filtrado[i] = vector[i];
        }
        for (int a = 0; a < vector2.length ;a++){

            filtrado[i] = vector2[a];
            i++;
        }

        System.out.println(Arrays.toString(filtrado));

    }
}
