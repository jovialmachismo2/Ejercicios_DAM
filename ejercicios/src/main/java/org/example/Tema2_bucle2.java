package org.example;

import java.util.Scanner;

public class Tema2_bucle2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();

        for (int i=n;i>0;i--){

            System.out.println(i);
        }
    }
}
