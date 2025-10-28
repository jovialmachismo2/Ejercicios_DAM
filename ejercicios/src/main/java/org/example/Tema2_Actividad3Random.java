package org.example;

import java.util.Random;
import java.util.Scanner;

public class Tema2_Actividad3Random {
    static void main() {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime de donde quieres que empiece el numero aleatorio");
        int min = teclado.nextInt();
        System.out.println("Dime donde quieres que acabe el numero aleatorio");
        int max = teclado.nextInt();
        System.out.println("Cuantas veces quieres que se repita");
        int repetir = teclado.nextInt();
        for (int i=0;i<repetir;i++){
            int resultado = aleatorio.nextInt(max - min + 1) + min;
            System.out.println(resultado);
        }

    }
}
