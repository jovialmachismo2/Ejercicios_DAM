package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Tema3_bateria_Arrays5 {
    static void main() {


        int[] vector = {1, 2, 3, 4, 5};
        int aux = vector[vector.length-1];
        int pos = 1;
        int aux2 = vector[0];

        for (int i = 0; i < vector.length-1 ; i++) {

            if (i == 0){

                vector[0] = aux;
            }else{
                vector[i] = aux2;
                System.out.println(aux2);
                aux2 = vector[pos-1];
                pos++;
            }
        }

        System.out.println(Arrays.toString(vector));

    }
}
