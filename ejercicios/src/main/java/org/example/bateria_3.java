package org.example;

import java.util.Scanner;

public class bateria_3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un numero: ");
        int num = teclado.nextInt();
        if (num == 0) {
            System.out.println(num + " es igual a zero");

        } else if (num > 0) {
            System.out.println(num + " es un numero positivo");
        } else {
            System.out.println(num + " es un numero negativo");
        }

    }
    }
