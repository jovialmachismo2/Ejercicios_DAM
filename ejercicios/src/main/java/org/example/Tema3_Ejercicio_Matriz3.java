package org.example;

import java.util.Arrays;
import java.util.Random;

public class Tema3_Ejercicio_Matriz3 {
    static void main() {
        Random aleaotrio = new Random();

        int num = 0;
        int A[][] = new int[3][3];

        int B[][] = new int[3][3];

        int M[][] = new int[3][3];

        for (int i = 0; i <A.length ; i++) {
            for (int j = 0; j < A[i].length ; j++) {
                A[i][j] = num = aleaotrio.nextInt(10);
                B[i][j] = num = aleaotrio.nextInt(10);
            }
        }
        for (int numerosB[] : B ){
            System.out.println(Arrays.toString(numerosB));
        }
        System.out.println(  );
        for (int numerosA[] : A ){
            System.out.println(Arrays.toString(numerosA));
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] >= B[i][j]){
                    M[i][j] = A[i][j];
                }else {
                    M[i][j] = B[i][j];
                }
            }
        }
        System.out.println();
        for (int numerosM[] : M){
            System.out.println(Arrays.toString(numerosM));
        }
    }
}
