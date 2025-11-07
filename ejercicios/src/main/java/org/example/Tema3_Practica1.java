package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tema3_Practica1 {
    static void main() {
        pepe:

        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        boolean funcion  = true;
        int suma1 = 0;
        int suma2 = 0;
        int contador_equipo1 = 0;
        int contador_equipo2 = 0;

        System.out.println("Bienvenido a la batalla de samurais🤺🤺");

                System.out.println("Introduce el equipo 1");
                String usuario1 = teclado.nextLine();
                String equipo1[] = usuario1.split(" ");

                for (int i = 0;i< equipo1.length;i++){
                    int num = Integer.parseInt(equipo1[i]);

                    suma1 = suma1+num;
                    System.out.println(num);
                }

                if (suma1 != 30){
                    System.out.println("ERROR: LA POTENCIA TOTAL NO ES 30");
                    return;
                }

                System.out.println(Arrays.toString(equipo1));

                System.out.println("Intrpduce el equipo 2");
                String usuario2 = teclado.nextLine();
                String equipo2[] = usuario2.split(" ");

                for (int i = 0;i< equipo2.length;i++){
                    int num = Integer.parseInt(equipo2[i]);

                    suma2 = suma2+num;
                    System.out.println(num);
                    continue pepe;
                }

                if (suma2 != 30){
                    System.out.println("ERROR: LA POTENCIA TOTAL NO ES 30");
                    return;

                }
                int pos = aleatorio.nextInt(0,8);

                System.out.println("La batalla inicia con el Samurai " + pos + ".");

                for (int i = pos ; i < equipo1.length ; i++){

                        int num1 = Integer.parseInt(equipo1[i]);
                        int num2 = Integer.parseInt(equipo2[i]);

                        if (num1 > num2) {
                            contador_equipo1++;
                            System.out.println("Samurai " + i + " Gana Equipo 1 [" + num1 + " vs " + num2 + "]");
                        } else if (num1<num2) {
                            contador_equipo2++;
                            System.out.println("Samurai " + i + " Gana Equipo 2 [" + num1 + " vs " + num2 + "]");
                        }else {
                            System.out.println("empatte");
                        }
                        System.out.println();

                }
                for (int i = 0; i < pos;i++ ){

                    int num1 = Integer.parseInt(equipo1[i]);
                    int num2 = Integer.parseInt(equipo2[i]);
                    if (num1 > num2) {
                        contador_equipo1++;
                        System.out.println("Samurai " + i + " Gana Equipo 1 [" + num1 + " vs " + num2 + "]");
                    } else if (num1<num2) {
                        contador_equipo2++;
                        System.out.println("Samurai " + i + " Gana Equipo 2 [" + num1 + " vs " + num2 + "]");
                    }else {
                        System.out.println("empatte");
                    }
                    System.out.println();

                }
                if (contador_equipo1 < contador_equipo2){
                    System.out.println("Gana equipo dos, equipo 1 ha tenido " + contador_equipo2);
                } else if (contador_equipo1 > contador_equipo2) {
                    System.out.println("Gana equipo 1, equipo 2 ha tenido " + contador_equipo1);

                }else {
                    System.out.println("Los dos son igual de malos");
                }


    }
}
