package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tema3_Practica2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);



        Random aleaotorio = new Random();

        int[] bolas_sorteo = new int[6];

        System.out.println("Tienes que elegir 6 numero diferentes entre 1/49 y el reintegro 0/9: ");

        String usuario = teclado.next();

        boolean primitiva = usuario.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}");

        if (primitiva){
            String[] bola_usuario = usuario.split("[-/]");

            System.out.println(Arrays.toString(bola_usuario));

            for (int i = 0; i < bolas_sorteo.length; i++){

                bolas_sorteo[i] = aleaotorio.nextInt(6);
            }

            System.out.println(Arrays.toString(bolas_sorteo));

        }else {
            System.out.println("Formato incorrecto");
        }








    }
}
