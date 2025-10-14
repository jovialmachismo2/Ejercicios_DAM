package org.example;

import java.util.Scanner;

public class Tema2_bateria2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una frase");
        String frase1 = teclado.nextLine();
        System.out.println("Dime otra frase");
        String frase2 = teclado.nextLine();
        int longitud_frase1 = frase1.length();
        int longitud_frase2 = frase2.length();

        if (longitud_frase1 < longitud_frase2){
            System.out.println("la segunda frase es mayor que la primera");
            System.out.println("segunda frase tiene " + longitud_frase2 + " caracteres y la primera " + longitud_frase1);
        }else {
            System.out.println("la primera frase es mayor que la segunda");
            System.out.println("Primera frase tiene " + longitud_frase1 + " caracteres y la segunda " + longitud_frase2);
        }
    }
}
