package org.example;

import java.util.Scanner;

public class Tema3_Bateria_bucle2 {
    static void main() {
        Scanner teclado= new Scanner(System.in);

        System.out.println("Introduce la altura que quieres para el triangulo");
        int usuario = teclado.nextInt();

        for (int i = 1; i <= usuario; i++){

            for (int j = 1 ; j <= i ; j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
