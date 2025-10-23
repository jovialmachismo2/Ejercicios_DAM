package org.example;

import java.util.Scanner;

public class Tema2_bucle1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String buena = "RiverPlate";

        do {

            System.out.println("Introduce tu contraseña");
            String contrasenya = teclado.next();


            if (contrasenya.equals(buena)){

                break;
            }
        }while (true);
    }
}
