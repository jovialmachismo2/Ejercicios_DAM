package org.example;

import java.util.Scanner;

public class bateria_2 {
    static void main() {

        final double JORNADA = 40;
        double horas = 0;
        Scanner teclado = new Scanner(System.in);
        try {

            System.out.println("Introduzca las horas: ");
            horas = teclado.nextDouble();
            System.out.println("Introduzca la traifa por hoa: ");
        } catch (Exception e){
            System.out.println("numeros");

        }

        double tarifa = teclado.nextDouble();
        double salario;
        double tarifa_extra = (tarifa * 1.5);


        if (horas > JORNADA) {

            double horas_extra = (horas - JORNADA);
            salario = (JORNADA * tarifa) + (horas_extra * tarifa_extra);

        } else {
            salario = (horas * tarifa);
        }

        System.out.println("Tu salario: " + salario );

    }
}
