package org.example;

import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Tema3_practica3_ZX {
    static void main() {
        int alto = 0;
        Scanner teclado = new Scanner(System.in);
        String letra = "";
        System.out.println("Introduce la resolucion de tu pantalla (ancho / alto)");
        System.out.println("Ancho:");
        int ancho = teclado.nextInt();
        if (ancho % 8 == 0 &&  ancho <= 48) {
            System.out.println("Alto:");
            alto = teclado.nextInt();
        }else {
            System.out.println("Valor del ancho incorrecto");
            return;
        }

        if (alto % 8 == 0 && alto <=48 ){

            String matriz [][] = new String[alto][ancho];

            System.out.println("Introduce (linea a linea) los colores de tu imagen pata cada pixel");
            for (int i = 0; i < matriz.length; i++) {
                String colores = teclado.next();
                String fila[] = colores.split("");

                if (colores.matches("[A-O]+") && fila.length == ancho){

                    for (int j = 0; j < matriz[i].length; j++) {
                        matriz[i][j] = fila[j];
                    }

                }else {
                    System.out.println("Has introducido un valor de pixel incorrecto (A-O)");
                    i--;
                }
            }

            for (String imagen[] : matriz){
                System.out.println(Arrays.toString(imagen));
            }

            for (int i = 0; i < matriz.length/2; i++) {
                for (int j = 0; j < matriz[i].length/2; j++) {
                    
                }
            }

        }else{
            System.out.println("Valor del alto incorrecto");
        }
    }
}
