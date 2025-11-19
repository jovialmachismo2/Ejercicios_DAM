package org.example;

import java.util.Arrays;
import java.util.Random;

public class Tema3_Ejercicio_Matriz1 {
    static void main() {

        Random aleatorio = new Random();

        int filas =aleatorio.nextInt(6)+2;

        int matriz[][] = new int[filas][filas];
        for (int i=0; i < matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){

                matriz[i][j] = aleatorio.nextInt(10)+1;
            }
        }

        for (int hola[] : matriz){
            System.out.println(Arrays.toString(hola));
        }

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                if (i==j){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }

    }
}
