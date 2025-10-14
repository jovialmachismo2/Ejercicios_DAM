package org.example;

import java.util.Scanner;

public class Tema2_bateria1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una frase");

        String frase = teclado.nextLine();

        int longitud = frase.length();
        System.out.println(longitud);

        String espacios = frase.replace(" ", "");
        System.out.println(espacios);

        int mitad_long = longitud / 2;
        String mitad1 = frase.substring(1, mitad_long);
        String mitad2 = frase.substring(mitad_long, longitud);
        System.out.println("La primera mitad es " + mitad1 + "y la segunda mitad es " + mitad2);
        String mayusculas = frase.toUpperCase();
        System.out.println(mayusculas);

    }
}
