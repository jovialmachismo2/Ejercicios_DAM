package org.example;

import java.util.Arrays;
import java.util.Random;

public class Tema3_modo3 {
    static void main() {

        boolean funciona = true;

        Random aleatorio = new Random();

        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = aleatorio.nextInt(10)+1;

        }

        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);

        System.out.println(Arrays.toString(numeros));

        while (funciona) {

            funciona = false;
            Arrays.sort(numeros);
            System.out.println(Arrays.toString(numeros));
            for (int i = 0; i < numeros.length; i++) {

                if (i != numeros.length - 1 && numeros[i] == numeros[i + 1]) {
                    System.out.println("Duplicado " + numeros[i]);
                    System.out.println(Arrays.toString(numeros));
                    numeros[i] = aleatorio.nextInt(10) + 1;
                    funciona = true;
                }

            }
        }


    }
}
