package org.example;

import java.util.Arrays;

public class Tema3_vectores {
    static void main() {
      int vector[] = {5,8,10,1,8};
      int largo = vector.length;
        System.out.println(Arrays.toString(vector));
        System.out.println(largo);
        vector[3] = 5;
        System.out.println(Arrays.toString(vector));




        for (int i = largo -1; i >= 0; i--){

            System.out.println(vector[i]);

        }
    }
}
