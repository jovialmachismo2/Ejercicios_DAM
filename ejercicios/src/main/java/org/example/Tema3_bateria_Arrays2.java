package org.example;

import java.util.Arrays;
import java.util.Random;

public class Tema3_bateria_Arrays2 {
    static void main() {
        int vector[] = {1,2,3,4,5};
        int aux = 0;
        for (int i =0; i < vector.length/2 ; i++){

            aux = vector[i];
            vector[i] = vector[vector.length-1-i];
            vector[vector.length-1-i]=aux;


        }
        System.out.println(Arrays.toString(vector));
    }
}
