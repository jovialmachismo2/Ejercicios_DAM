package org.example;

import javax.swing.plaf.SliderUI;
import java.util.Scanner;

public class practica_3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int altura = 0;
        int altura_minima = 140;
        int peso = 0;
        //Es para probar que no escriban y de errores
        try {
            //Ahora vamos a empezar la practica 3
            System.out.println("**Bienvendido al raton jugueton**");
            //Le pedimos al cliente que nos diga su altura
            System.out.println("Introduzca su altura");
            //Vamos a hacer que nos escriba su altura usando el teclado
            altura = teclado.nextInt();
            //Ahora vamos a usar un if para ver si su altura es aceptable o no
        } catch (Exception e) {
            System.out.println("ERROR DE LECTURA. BAJA DE LA BASCULA Y VUELEVE A SUBIR...");
            return;
        }
        //Este if es por si sale un numero mas bajo que 0 o mayor que 230 , que al cumplirse esta condicion te saque de programa
        if (altura < 0 || altura > 230) {

            System.out.println("ERROR DE LECTURA. BAJA DE LA BASCULA Y VUELEVE A SUBIR...");
            return;

        }
        //if por si es menor q 140
        if (altura < altura_minima) {

            int enano = 140 - altura;
            System.out.println("LO SIENTO, NO PUEDES MONTAR LA ATRACCION, TE FALTAN " + enano + "cm");
        }//Este if por si pasa los 140 cm

        //if por si es mayor que 140
        else if (altura >= 140) {

            //Es para probar que no escriban y de errores
            try {
                System.out.println("Leyendo peso (kg)");
                peso = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("No escribas que te veo");
                return;
            }

            //Calcula el peso minimo
            double peso_minimo = altura * 2 / 8;

            if (peso > 120) {
                double gordo = peso - 120;
                System.out.println("Lo siento. Sobrepasas " + gordo + "kg");
                System.exit(0);
            } else if (peso < 0) {
                System.out.println("ERROR DE LECTURA. BAJA DE LA BASCULA Y VUELEVE A SUBIR...");
                return;
            }
            //Este es por si el chico esta muy faco y pesa menos que su peso minimo
            if (peso < peso_minimo) {
                System.out.println("Lo siento no puedes subir pesas menos que tu peso minimo " + peso_minimo);
            }
            //Si está todo bien pues puede subir a la atraccion
            else {
                System.out.println("Pesas " + peso + "kg peso minimo calculado " + peso_minimo);
                System.out.println("¡¡SUBE A LA ATRACCION!!");
            }

        }

    }
}
