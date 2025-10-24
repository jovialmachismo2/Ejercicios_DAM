package org.example;

import java.util.Scanner;

public class Tema2_practica3 {
    static void main() {
        int contador = 10;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el ISBN: ");
        int total = 0;
        String isbn = teclado.next();
        int largo = isbn.length();


    if (largo == 10) {

                for (int i = 0; i < largo; i++) {
                    char character = isbn.charAt(i);
                    int num = Integer.parseInt(String.valueOf(isbn.charAt(i)));
                    int resultado = contador * num;
                    if ( i == 9 && character == 'x') {
                        resultado = contador * 10;
                    }
                    total = resultado + total;
                    System.out.println(contador + " * " + num + " = " + resultado);
                    contador--;
                }
        System.out.println(total);
    }else {
        System.out.println("ISBN NO ES CORRECTO");
    }

    }
}
