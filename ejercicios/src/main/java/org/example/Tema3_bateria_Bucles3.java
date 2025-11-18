package org.example;

import java.util.Scanner;

public class Tema3_bateria_Bucles3 {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el numero maximo");

        int usuario = teclado.nextInt();

        interno:
        for (int i = 1; i <= 9 ; i++) {


            for (int j = 1; j <= 10; j++) {

                int suma = i * j;
                System.out.println(i + " x " + j + " = " + (i*j));
                if (suma > usuario){
                    break interno;
                }


            }
        }
    }
}
