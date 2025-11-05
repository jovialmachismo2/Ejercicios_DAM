package org.example;

import java.util.Arrays;
import java.util.Random;

public class Tema3_vectores {
    static void main() {
      int vector[] = {5,8,10,1,8};
        Random aleatorio = new Random();
      int largo = vector.length;
        System.out.println(Arrays.toString(vector));
        System.out.println(largo);
        vector[3] = 5;
        System.out.println(Arrays.toString(vector));

        for (int i = largo -1; i >= 0 ; i--){

            System.out.println(vector[i]);

        }
        for (int i = 0; i < vector.length ; i++){

            vector[i] = aleatorio.nextInt(501);

        }
        System.out.println(vector);
        int vector3[] = new int[4];


    }
}
