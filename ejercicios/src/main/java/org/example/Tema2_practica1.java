package org.example;

import java.util.Scanner;

public class Tema2_practica1 {
    static void main() {
        int dia_max = 31;
        int mes_max = 12;
        int anio_max = 2025;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa)");

        String fecha = teclado.nextLine();

        int tamanio = fecha.length();

        String dia = fecha.substring(0, 2);
        String mes = fecha.substring(3, 5);
        String anio = fecha.substring(6, 10);

        int dia_int = Integer.parseInt(dia);
        int mes_int = Integer.parseInt(mes);
        int anio_int = Integer.parseInt(anio);

        if (tamanio < 10) {
            if (dia_int > dia_max || mes_int > mes_max || anio_int > anio_max) {
                System.out.println("formato introducido es icorrecto");
            } else {
                System.out.println(dia + " + " + mes + " + " + anio);
            }
        }
    }
}