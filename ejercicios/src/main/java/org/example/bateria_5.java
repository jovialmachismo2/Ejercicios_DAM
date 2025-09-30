package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bateria_5 {
static void main() {
    Scanner teclado = new Scanner(System.in);
    int num1 = 0 ;
    int num2 = 0 ;

    boolean control = true;

    do {
        try {
            System.out.println("Escribe un numero");
            num1 = teclado.nextInt();
            System.out.println("Escribe un numero");
            num2 = teclado.nextInt();
            control = false;
        } catch (Exception e) {
            System.out.println("ERROR: no se puede dividir entre 0");
            control = true;
        }
        teclado.nextLine();
    }while (control==true);

    int resultado = num1 / num2;

    System.out.println("pipipipipip");

    System.out.println("El resultado es " + resultado);
}

}

