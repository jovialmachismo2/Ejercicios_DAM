package org.example;

import java.util.Scanner;

public class bateria_6 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        double base, altura, A;
        do {

            System.out.println("Escribe el valor de la base");
            base = teclado.nextDouble();

            if (base<=0){
                System.out.println("El valor de la base tiene que ser positivo");
            }

        }while (base <= 0);


        do {

            System.out.println("Escribe el valor de la altura");
            altura = teclado.nextDouble();

            if (altura<=0){
                System.out.println("El valor de la altura tiene que ser positivo");
            }

        }while (altura <= 0);

            A = (base * altura) /2;

        System.out.println("El area del triangulo es " + A);
    }
}
