package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tema3_Practica2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        int complementario = 0;

        Random aleaotorio = new Random();

        int contador = 0;

        int contador_complementario = 0;

        int[] maquina_sorteo = new int[7];

        int bola_usuario_int[] = new int[6];

        int bolas_sorteo[] = new int[6];

        int reintegro_sorte = aleaotorio.nextInt(10);

        System.out.println("Tienes que elegir 6 numero diferentes entre 1/49 y el reintegro 0/9: ");

        String usuario = teclado.next();

        boolean primitiva = usuario.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}");


        if (primitiva){

            String[] bola_usuario = usuario.split("[-/]");

            String reintegro_string[] = usuario.split("/");

            int reintegro = Integer.parseInt(reintegro_string[1]);

            for (int i =0; i < bola_usuario.length ; i++ ) {

                bola_usuario_int[i] = Integer.parseInt(bola_usuario[i]);

                if (bola_usuario_int[i] < 1 || bola_usuario_int[i] > 49 || reintegro < 0 || reintegro > 9){

                    System.out.println("El numero que introduciste es mayor al indicado");

                    return;

                }
                for (int j = i ; j < bola_usuario_int.length ; j++){

                    if (bola_usuario_int[i] == bola_usuario_int[j + 1]){

                        System.out.println("No se debe repetir ningun numero");

                        return;

                    }
                }
            }

            System.out.println(Arrays.toString(bola_usuario));

            boolean repite = true;

            do {

                repite = false;

                for (int i = 0; i < maquina_sorteo.length  ; i++) {

                    maquina_sorteo[i] = aleaotorio.nextInt(1, 50);

                }
                for (int i = 0; i < maquina_sorteo.length -1; i++) {

                    bolas_sorteo[i] = maquina_sorteo[i];

                    for (int j = i; j < maquina_sorteo.length - 1; j++) {

                        if (maquina_sorteo[i] == maquina_sorteo[j + 1]) {

                            repite = true;
                        }
                    }

                }
            }while (repite);

            System.out.println();

            complementario = maquina_sorteo[maquina_sorteo.length - 1];

            System.out.println("SORTEO");

            Arrays.sort(bolas_sorteo);

            System.out.println(Arrays.toString(bolas_sorteo));

            System.out.println("Complementario: " + complementario);

            System.out.println("Reintegro: " + reintegro_sorte);

            for (int i = 0; i < bola_usuario_int.length ; i++){

                if (bola_usuario_int[i] == complementario ){

                    contador_complementario++;
                }

                for (int j = 0; j < bola_usuario_int.length  ; j++){

                    if (bola_usuario_int[i] == bolas_sorteo[j]){
                        contador++;
                    }
                }
            }

            System.out.println();
            System.out.println("RESULTADOS:");

            System.out.println("Aciertos: " + contador);

            if (reintegro == reintegro_sorte){
                System.out.println("Reintegro");
            }

            System.out.println();

            System.out.println("Categorias: ");
            if (contador > 5 && reintegro == reintegro_sorte){
                System.out.println("Categoria especial");
                
            } else if (contador > 5) {
                System.out.println("Primera categoria");

            } else if (contador == 5 && contador_complementario == 1) {
                System.out.println("Segunda categoria");
                
            } else if (contador == 5) {
                System.out.println("Tercera categoria");
            
            } else if (contador == 4) {
                System.out.println("Cuarta categoria");

            } else if (contador == 3) {
                System.out.println("quinta categoria");
            } else {
                System.out.println("No premiado");
            }

        }else {
            System.out.println();
            System.out.println("Formato incorrecto");
        }

    }
}
