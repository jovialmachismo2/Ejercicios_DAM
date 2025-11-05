package org.example;

import java.util.Random;

public class ternarios {
    static void main() {
        Random aleatorio = new Random();
        int num_aleatorio = aleatorio.nextInt(500, 100001); //DE 500 a 100.000
        String num_aleatorio_string = Integer.toString(num_aleatorio);
        int longitud_numero_aleatorio = num_aleatorio_string.length();
        int sumatorio = 0;
        System.out.println("Suma descendente del número generado: " + num_aleatorio);

        for (int i = 0 ; i < longitud_numero_aleatorio ; i++) {
            String num_string = num_aleatorio_string.substring(i, longitud_numero_aleatorio);
            int longitud_num = num_string.length();
            int num = Integer.parseInt(num_string);
            if (longitud_num != 1) {
                System.out.print(num_string + " + ");
            } else {
                System.out.print(num_string + " = ");
            }
            sumatorio += num;
        }
        System.out.print(sumatorio);

    }
}