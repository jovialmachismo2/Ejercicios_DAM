package org.example;

import java.util.Random;

public class aleatoriod {
    static void main() {
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(5)+5;
        int numero2 = aleatorio.nextInt(5,10);
        System.out.println(numero);

        int numero3 = (int) (aleatorio.nextDouble()*100+1);
        System.out.println(numero3);

    }
}
