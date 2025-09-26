package org.example;

import java.util.Scanner;

public class bateria_2 {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        final double JORNADA = 40;
        System.out.println("Introduzca las horas: ");
        double horas = teclado.nextDouble();
        System.out.println("Introduzca la traifa por hoa: ");
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
