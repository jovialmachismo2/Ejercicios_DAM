package org.example;

import java.util.Scanner;

public class bateria_1 {
    static void main() {


        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca las horas: ");
        double horas = teclado.nextDouble();
        System.out.println("Introduzca la traifa por hoa: ");
        double tarifa = teclado.nextDouble();
        double salario = horas * tarifa;
        System.out.println("Tu salario (extra) : " + salario );
        }



    }
