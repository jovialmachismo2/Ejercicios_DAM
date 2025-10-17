package org.example;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema2_actividad1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        LocalDateTime fecha = LocalDateTime.now();
        int anyo_actual = fecha.getYear();
        int anyo_nacimiento_int = 0;
        int modo = 0;
        final int anyo_minimo = 1900;
        boolean seguir = true;

        System.out.println("Elige un modo");
        System.out.println("[1] - amio de nacimiento");
        System.out.println("[2] - edad");
        if (teclado.hasNextInt()) {

            modo = teclado.nextInt();

        } else {
            System.out.println("valor del modo incorrecto");
            seguir = false;
        }

        if (seguir) {
            if (modo == 1) {
                System.out.println("Introduce tu año de nacimiento");
                String anyo_nacimiento = teclado.next();

                try {
                    anyo_nacimiento_int = Integer.parseInt(anyo_nacimiento);
                } catch (NumberFormatException e) {
                    System.out.println("El formato no es numerico");
                    return;
                }
            } else if (modo == 2) {
                int edad = 0;
                System.out.println("Introduce la edad");
                if (teclado.hasNextInt()) {
                    edad = teclado.nextInt();
                } else {
                    System.out.println("La edad no tiene formato correcto(numerico)");
                    return;
                }
                if (edad >= 0) {
                    anyo_nacimiento_int = anyo_actual - edad;
                } else {
                    System.out.println("la edad no es correcta");
                }
            } else {
                System.out.println("El modo introducido es incorrecto");
                return;

            }
            if (anyo_nacimiento_int >= anyo_minimo && anyo_nacimiento_int <= anyo_actual) {

                if (anyo_nacimiento_int <= 1927) {
                    System.out.println("Generacion sin bautizar");
                } else if (anyo_nacimiento_int >= 1928 && anyo_nacimiento_int <= 1944) {
                    System.out.println("Generacion silent");
                } else if (anyo_nacimiento_int >= 1945 && anyo_nacimiento_int <= 1964) {
                    System.out.println("Baby boomer");
                } else if (anyo_nacimiento_int >= 1965 && anyo_nacimiento_int <= 1981) {
                    System.out.println("Generacion X");
                } else if (anyo_nacimiento_int >= 1982 && anyo_nacimiento_int <= 1994) {
                    System.out.println("Millenials");
                } else {
                    System.out.println("Generacion Z");
                }
            }
        }
    }
}