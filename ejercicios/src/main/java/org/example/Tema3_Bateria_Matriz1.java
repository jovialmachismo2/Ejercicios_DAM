package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Tema3_Bateria_Matriz1 {
    static void main() {

        int matriz[][] = new int[3][3];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la matriz");


        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Intruduce un numero en la fila " + i + " columna " + j );
                int usuario = teclado.nextInt();

                matriz[i][j] = usuario;
            }
        }
        System.out.println("Matriz");
        for (int numero_matriz[] : matriz){
            System.out.println(Arrays.toString(numero_matriz));
        }
        System.out.println("Ahora elije un numero para ubicarlo");
        int num = teclado.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == num){
                    System.out.println("El numero " + num + " se encuentra en la posicion " + i + " " + j);
                    break;
                }
            }
        }



    }
}
