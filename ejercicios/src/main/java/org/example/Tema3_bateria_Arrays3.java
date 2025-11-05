package org.example;

import java.util.Random;
import java.util.Scanner;

public class Tema3_bateria_Arrays3 {
    static void main() {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        int vector[] = new int[25];
        int contador = 0;
        for (int i = 0;i< vector.length-1;i++){
            vector[i] = aleatorio.nextInt(0,101);
        }

        System.out.println("Ingresa un numero:");
        int usuario = teclado.nextInt();
        for (int i = 0; i < vector.length -1; i++){
            if (vector[i] == usuario){
                contador++;
            }

        }
        System.out.println("El numero " + usuario + " aparece " + contador  );
    }
}
