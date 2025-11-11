package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tema3_Actividad_Ruleta {
    static void main() {

        String color_apuesta = "";
        String par_impar_apuesta = "";

        Scanner teclado = new Scanner(System.in);

        Random aleatorio = new Random();

        final String color[] = {"rojo", "negro"};

        Integer numeritos[] = new Integer[37];

        for (int i = 0; i < numeritos.length; i++){
            numeritos[i]=i;
        }

        final String par_impar[] = {"par","impar"};

        System.out.println("Introduce un numero del 0-36: ");
        int numero_usuario = teclado.nextInt();

        if (!Arrays.asList(numeritos).contains(numero_usuario)){
            System.out.println("ERROR NUMERO NO VALIDO");
            return;
        }

        if (numero_usuario != 0){
            System.out.println("Introduce el color de tu apuesta rojo o negro");
            color_apuesta = teclado.next().toLowerCase();

            if (!Arrays.asList(color).contains(color_apuesta)){
                System.out.println("Error el color no es valido");
                return;
            }

            System.out.println("Introduce el par-impar tu apuesta");
            par_impar_apuesta = teclado.next().toLowerCase();

            if (!Arrays.asList(par_impar).contains(par_impar_apuesta)){
                System.out.println("Error par impar no es valido");
                return;
            }
        }
        String color_sorteo = color[aleatorio.nextInt(2)];
        int numero_sorteo = numeritos[aleatorio.nextInt(37)];

        String par_impar_sorteo = numero_sorteo % 2 == 0 ? "par":"impar";

        System.out.println("Ha salido " + numero_sorteo + " " + color_sorteo + " " + par_impar_sorteo);

        if (numero_sorteo==numero_usuario && color_sorteo.equals(color_apuesta) && par_impar_sorteo.equals(par_impar_apuesta)){
            System.out.println("Has ganado");
        } else if (numero_sorteo==numero_usuario) {
            System.out.println("Has acertado el numero");
        } else if (color_sorteo.equals(color_apuesta)) {
            System.out.println("Has acertado el color " + color_apuesta);
        } else if (par_impar_apuesta.equals(par_impar_sorteo)) {
            System.out.println("Has acertado " + par_impar_apuesta);
        }else {
            System.out.println("Has perdido");
        }

    }
}
