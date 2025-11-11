package org.example;

import java.util.Random;
import java.util.Scanner;

public class Tema3_Practica1 {
    public static void main() {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        // Control del bucle que pide equipos
        boolean seguirPidiendo = true;

        // cuando alguna potencia esté fuera de rango
        boolean numeroValido = true;

        // suma de potencias del equipo que se esté introduciendo
        int suma = 0;

        // Variable para ir convirtiendo cada string a número
        int num = 0;

        // Contador para saber si estamos pidiendo el equipo 1 o el 2
        int contadorEquipoQuePido = 1;

        // Marcadores de rondas ganadas por cada equipo
        int rondasGanadasEquipo1 = 0;
        int rondasGanadasEquipo2 = 0;

        // Arrays que guardarán los dos equipos introducidos por el usuario
        String[] equipo1 = null;
        String[] equipo2 = null;

        System.out.println("Bienvenido a la batalla de samurais🤺🤺");

        //PIDE EQUIPO 1 Y CUANDO ESTÉ BIEN EQUIPO 2
        do {
            System.out.println("Introduce el equipo " + contadorEquipoQuePido);
            String usuario = teclado.nextLine();

            // Separa por espacios
            String[] equipo = usuario.split(" ");

            // Validación: deben ser exactamente 7 potencias
            if (equipo.length != 7) {
                System.out.println("ERROR: Debes poner exactamente 7 potencias.");
                continue;            // vuelve a pedir el mismo equipo
            }

            // Recorre las 7 potencias introducidas
            for (int i = 0; i < equipo.length; i++) {
                // Convierte a número
                num = Integer.parseInt(equipo[i]);

                // Suma para comprobar el total de 30
                suma = suma + num;

                // Validación de rango de cada potencia
                if (num < 0 || num > 24) {
                    System.out.println("Tiene que ser un numero del 0 al 24");
                    suma = 0;              // resetea la suma
                    numeroValido = false;  // marca que hubo un número fuera de rango
                    break;                 // sale del for de validación
                }
            }

            // Si todas las potencias estaban en rango…
            if (numeroValido) {
                // Comprueba que la suma total sea exactamente 30
                if (suma != 30) {
                    System.out.println("ERROR: LA POTENCIA TOTAL NO ES 30");
                    suma = 0;              // resetea y vuelve a pedir el mismo equipo
                    continue;
                }

                // Si estamos en el primer equipo, lo guardamos y pasamos a pedir el segundo
                if (contadorEquipoQuePido == 1) {
                    equipo1 = equipo.clone();   // copia el equipo introducido
                    contadorEquipoQuePido++;    // ahora pediremos el equipo 2
                    suma = 0;                   // resetea suma para el próximo equipo
                } else if (contadorEquipoQuePido == 2) {
                    // Si ya era el segundo equipo, lo guardamos y salimos del bucle de entrada
                    equipo2 = equipo.clone();
                    seguirPidiendo = false;
                }
            }

            // Resetea a true para la siguiente vuelta del do while
            numeroValido = true;

        } while (seguirPidiendo);

        // --- BLOQUE DE COMBATE ---

        // Elige al azar con qué samurái (índice) empieza (0..6). nextInt(0,7) -> [0,6]
        int pos = aleatorio.nextInt(0, 7);

        System.out.println("La batalla inicia con el Samurai " + (pos + 1) + ".");

        // Recorre desde 'pos' hasta el final (pos, pos+1, ..., 6)
        for (int i = pos; i < equipo1.length; i++) {
            int num1 = Integer.parseInt(equipo1[i]);
            int num2 = Integer.parseInt(equipo2[i]);

            if (num1 > num2) {
                rondasGanadasEquipo1++;
                System.out.println("Samurai " + (i + 1) + " Gana Equipo 1 [" + num1 + " vs " + num2 + "]");
            } else if (num1 < num2) {
                rondasGanadasEquipo2++;
                System.out.println("Samurai " + (i + 1) + " Gana Equipo 2 [" + num1 + " vs " + num2 + "]");
            } else {
                System.out.println("Samurai " + (i + 1) + " EMATTE [" + num1 + " vs " + num2 + "]");
            }
            System.out.println();
        }

        // …y luego desde 0 hasta pos-1 (para completar la vuelta circular)
        for (int i = 0; i < pos; i++) {
            int num1 = Integer.parseInt(equipo1[i]);
            int num2 = Integer.parseInt(equipo2[i]);

            if (num1 > num2) {
                rondasGanadasEquipo1++;
                System.out.println("Samurai " + (i + 1) + " Gana Equipo 1 [" + num1 + " vs " + num2 + "]");
            } else if (num1 < num2) {
                rondasGanadasEquipo2++;
                System.out.println("Samurai " + (i + 1) + " Gana Equipo 2 [" + num1 + " vs " + num2 + "]");
            } else {
                System.out.println("Samurai " + (i + 1) + " EMATTE [" + num1 + " vs " + num2 + "]");
            }
            System.out.println();
        }

        // Resultado final (en tu lógica, “bajas” del rival = rondas ganadas por el ganador)
        if (rondasGanadasEquipo1 < rondasGanadasEquipo2) {
            System.out.println("Gana equipo dos, equipo 1 ha tenido " + rondasGanadasEquipo2);
        } else if (rondasGanadasEquipo1 > rondasGanadasEquipo2) {
            System.out.println("Gana equipo 1, equipo 2 ha tenido " + rondasGanadasEquipo1 + " bajas");
        } else {
            System.out.println("Los dos son igual de malos");
        }
    }
}
