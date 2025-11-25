package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tema3_Practica2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        // Aquí guardaremos el número complementario del sorteo
        int complementario = 0;

        // Objeto para generar números aleatorios
        Random aleaotorio = new Random();

        // Contará cuántos números del usuario coinciden con las 6 bolas del sorteo
        int contador = 0;

        // Contará si el usuario ha acertado el complementario
        int contador_complementario = 0;

        // Vector con las 7 bolas que genera la máquina (6 normales + 1 complementario)
        int[] maquina_sorteo = new int[7];

        // Vector con los 6 números que introduce el usuario (en int)
        int bola_usuario_int[] = new int[6];

        // Vector con las 6 bolas del sorteo
        int bolas_sorteo[] = new int[6];

        // Generamos el reintegro del sorteo (número entre 0 y 9)
        int reintegro_sorte = aleaotorio.nextInt(10);

        System.out.println("Tienes que elegir 6 numero diferentes entre 1/49 y el reintegro 0/9: ");

        // Leemos lo que escribe el usuario
        String usuario = teclado.next();

        // Comprobamos que el formato escrito sigue el patrón correcto
        boolean primitiva = usuario.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}");

        // Si el formato es correcto, seguimos
        if (primitiva){

            // Separamos todos los números usando - y / como separadores
            String[] bola_usuario = usuario.split("[-/]");

            // Separamos solo por la barra para quedarnos con el reintegro al final
            String reintegro_string[] = usuario.split("/");

            // Convertimos el reintegro del usuario a número entero
            int reintegro = Integer.parseInt(reintegro_string[1]);

            // Recorremos los 6 primeros valores (las 6 bolas del usuario)
            for (int i = 0; i < bola_usuario_int.length; i++) {

                // Convertimos cada número del usuario (String) a int
                bola_usuario_int[i] = Integer.parseInt(bola_usuario[i]);

                // Comprobamos que cada número está entre 1 y 49
                // y que el reintegro está entre 0 y 9
                if (bola_usuario_int[i] < 1 || bola_usuario_int[i] > 49 || reintegro < 0 || reintegro > 9) {

                    System.out.println("El numero que introduciste no es el indicado");
                    return; // Terminamos el programa si hay un número fuera de rango

                }

                // Segundo bucle para comprobar que el usuario NO repite números
                // Comparamos el número actual con todos los anteriores
                for (int j = 0; j < i; j++) {

                    if (bola_usuario_int[i] == bola_usuario_int[j]) {

                        System.out.println("No se debe repetir ningun numero");
                        return; // Terminamos si encontramos un número repetido
                    }
                }
            }

            // Mostramos las bolas que ha introducido el usuario
            System.out.println(Arrays.toString(bola_usuario));

            // Esta variable nos dice si en las bolas del sorteo hay repetidos
            boolean repite = true;

            // Repetimos el sorteo hasta que las 7 bolas generadas sean todas distintas
            do {

                repite = false; // Suponemos que no se repiten

                // Generamos 7 números aleatorios entre 1 y 49 (las 7 bolas del sorteo)
                for (int i = 0; i < maquina_sorteo.length; i++) {

                    maquina_sorteo[i] = aleaotorio.nextInt(1, 50);
                }

                // Comprobamos si hay repetidos dentro de esas 7 bolas
                for (int i = 0; i < maquina_sorteo.length - 1; i++) {

                    // Guardamos las 6 primeras en bolas_sorteo (las normales)
                    bolas_sorteo[i] = maquina_sorteo[i];

                    for (int j = i; j < maquina_sorteo.length - 1; j++) {

                        // Si encontramos dos números iguales, marcamos que hay repetidos
                        if (maquina_sorteo[i] == maquina_sorteo[j + 1]) {

                            repite = true;
                        }
                    }
                }
            } while (repite); // Si había repetidos, volvemos a generar las 7 bolas

            System.out.println();

            // El número complementario será la última bola del vector de la máquina
            complementario = maquina_sorteo[maquina_sorteo.length - 1];

            System.out.println("SORTEO");

            // Ordenamos las 6 bolas del sorteo para mostrarlas de menor a mayor
            Arrays.sort(bolas_sorteo);

            // Mostramos las 6 bolas del sorteo
            System.out.println(Arrays.toString(bolas_sorteo));

            // Mostramos complementario y reintegro del sorteo
            System.out.println("Complementario: " + complementario);
            System.out.println("Reintegro: " + reintegro_sorte);

            // Comprobamos los aciertos del usuario
            for (int i = 0; i < bola_usuario_int.length; i++) {

                // Miramos si el usuario ha acertado el complementario
                if (bola_usuario_int[i] == complementario) {
                    contador_complementario++;
                }

                // Comparamos cada número del usuario con cada bola del sorteo
                for (int j = 0; j < bola_usuario_int.length; j++) {

                    if (bola_usuario_int[i] == bolas_sorteo[j]) {
                        contador++; // Sumamos un acierto si coinciden
                    }
                }
            }

            System.out.println();
            System.out.println("RESULTADOS:");

            // Mostramos cuántos números normales ha acertado
            System.out.println("Aciertos: " + contador);

            // Comprobamos si el reintegro también coincide
            if (reintegro == reintegro_sorte) {
                System.out.println("Reintegro");
            }

            System.out.println();
            System.out.println("Categorias: ");

            // Categoría especial: acierta los 6 números y el reintegro
            if (contador > 5 && reintegro == reintegro_sorte) {
                System.out.println("Categoria especial");

                // 1 categoría: 6 aciertos sin reintegro
            } else if (contador > 5) {
                System.out.println("Primera categoria");

                // 2 categoría: 5 aciertos + complementario
            } else if (contador == 5 && contador_complementario == 1) {
                System.out.println("Segunda categoria");

                // 3 categoría: 5 aciertos sin complementario
            } else if (contador == 5) {
                System.out.println("Tercera categoria");

                // 4 categoría: 4 aciertos
            } else if (contador == 4) {
                System.out.println("Cuarta categoria");

                // 5 categoría: 3 aciertos
            } else if (contador == 3) {
                System.out.println("quinta categoria");

                // Cualquier otra cosa: no premiado
            } else {
                System.out.println("No premiado");
            }

        } else {
            // Si el formato del boleto no es correcto, mostramos este mensaje
            System.out.println();
            System.out.println("Formato incorrecto");
        }

    }
}

