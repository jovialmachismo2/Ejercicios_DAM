package org.example;

import java.util.Scanner;

public class Tema2_bucle6 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int resultado=0;

        System.out.println("cuantos numeros quieres sumar");
        int num = teclado.nextInt();

        for (int i = 1;i<=num;i++){

            System.out.println("Inserta numero " + i + ":");
            int suma = teclado.nextInt();
            resultado += suma;

        }
        System.out.println(resultado);
    }
}
