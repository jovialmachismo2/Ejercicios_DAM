package org.example;

import java.util.Scanner;

public class Tema2_bucle4 {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("escribe una palabra");
        String palabra = teclado.next();
        int letras = palabra.length();

        for (int i = 0; i < letras; i++){
            System.out.println(palabra.charAt(i));
        }
    }
}
