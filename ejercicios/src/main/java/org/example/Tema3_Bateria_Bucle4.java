package org.example;

import java.util.Scanner;

public class Tema3_Bateria_Bucle4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un numero");
        int usuario = teclado.nextInt();

        primos:
        for (int i = 2; i <usuario ; i++) {

            for (int j = 2; j < i; j++) {

                if ( i % j == 0){
                   continue primos;
                }
            }
            System.out.print(i + " ");
        }
    }
}
