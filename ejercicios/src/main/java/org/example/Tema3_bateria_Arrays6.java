package org.example;

import java.util.Arrays;

public class Tema3_bateria_Arrays6 {
    static void main() {
        int[] vector = {1, 2, 3,2 ,1};
        int[] filtrado = new int[vector.length/2];
        int[] filtrado2 = new int[vector.length/2];

        for (int i = 0; i < filtrado.length ; i++) {

                filtrado[i] = vector[i];
        }

        for (int i = 0; i < filtrado.length ; i++) {

            filtrado2[i] = vector[vector.length-1 -i];

        }

        System.out.println(Arrays.toString(filtrado));
        System.out.println(Arrays.toString(filtrado2));

       if (Arrays.equals(filtrado,filtrado2)){
           System.out.println("si son iguales");
       }else {
           System.out.println("No son iguales");
       }
    }
}
