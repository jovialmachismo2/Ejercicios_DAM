package org.example;

import java.util.Scanner;

public class bateria_7 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Tienes tomate (SI/NO)");
        String tomate = teclado.nextLine();
        System.out.println("Tienes aceite (SI/NO)");
        String aceite = teclado.nextLine();
        System.out.println("Tienes jamon (SI/NO)");
        String jamon = teclado.nextLine();
        if (tomate.equalsIgnoreCase ("no") || aceite.equalsIgnoreCase  ("no") || jamon.equalsIgnoreCase  ("no")){
            System.out.println("Hay que ir a comprar");
        }else {
            System.out.println("No hace falta ir a comprar");
        }
    }
}
