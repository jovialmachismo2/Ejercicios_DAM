package org.example;

import java.util.Arrays;
import java.util.Random;

public class Tema3_Bateria_Matriz2 {
    static void main() {
        Random aleatorio = new Random();
        int suma_fila = 0;
        int suma_columna = 0;

        int matriz[][] =new int[aleatorio.nextInt(1,6)][aleatorio.nextInt(1,6)];

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                matriz[i][j] = aleatorio.nextInt(11);
            }
        }
        for (int ver_matriz[]:matriz){
            System.out.println(Arrays.toString(ver_matriz));
        }

        System.out.println("Suma de filas");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma_fila = suma_fila + matriz[i][j];
            }
            System.out.println("fila " + (i + 1) + ": " + suma_fila );
            suma_fila=0;
        }
        System.out.println("Suma de COLUMNAS");

        for (int i = 0; i < matriz[0].length ; i++) {
            for (int j = 0; j < matriz.length ; j++) {
                suma_columna = suma_columna + matriz[j][i];

            }
            System.out.println("Columna " + (i + 1) + ": " + suma_columna );
            suma_columna=0;
        }
        int suma = 0;
        int fila = aleatorio.nextInt(matriz.length-1);
        for (int i = 0; i < matriz[0].length; i++) {
            suma += matriz[fila][i];
        }
        System.out.println("fila " + suma);
    }
}
