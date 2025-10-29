package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class prueba_ejemplo {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int intentos = 0;
        int num = aleatorio.nextInt(0,101);

        System.out.println("Elije un numero del 0-100");
        int num_usuario = 400;

        do {
            intentos++;
            try {
                num_usuario = teclado.nextInt();
            }catch (InputMismatchException e){
                System.out.println("No se vale letras");
                return;
            }
                if (num_usuario < num && num_usuario >= 0) {
                    System.out.println("Tu numero es menor");
                    System.out.println("Intenta otra ves, intentos " + intentos);

                } else if (num_usuario > num && num_usuario < 101) {
                    System.out.println("Tu numero es mayor");
                    System.out.println("Intenta otra ves, intentos " + intentos);
                }else if ( num_usuario < 0 || num_usuario > 100){
                    System.out.println("Tu numero tiene que ser entre (0/100");
                    System.out.println("Intenta otra ves, intentos " + intentos);
                    System.out.println("David callate");
                }

                if (intentos >= 10) {
                    break;
                }

            }while (num_usuario != num);

            if (num_usuario == num) {
                System.out.println("Bien, acertaste en el intento " + intentos);
            } else {
                System.out.println("Fallaste, has llegado al limite de intentos");
            }
        }
    }
