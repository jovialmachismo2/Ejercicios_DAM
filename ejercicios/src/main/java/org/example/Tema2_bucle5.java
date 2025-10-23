package org.example;

import java.util.Scanner;

public class Tema2_bucle5 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserta un numero");
        int num = teclado.nextInt();

        for (int i = 1;i<=10;i++){
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
