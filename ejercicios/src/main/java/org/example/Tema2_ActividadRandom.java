package org.example;

import java.util.Random;

public class Tema2_ActividadRandom {
    static void main() {
        Random aleatorio = new Random();
        int num1 = aleatorio.nextInt(6)+1;
        System.out.println(num1);
        int num2 = aleatorio.nextInt(6)+1;
        System.out.println(num2);
        int resultado = num1 + num2;
        System.out.println(resultado);
    }
}
