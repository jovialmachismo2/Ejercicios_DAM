package org.example;

import java.util.Scanner;

public class Tema3_bateria_Arrays10 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
    String vector[] = {"hola" ,"pepe" ,"popos","quiqui"};
        System.out.println("Dime una letra");
        char usuario = teclado.next().charAt(0);

        for (int i = 0; i < vector.length ; i++){

            if (usuario == vector[i].charAt(0)){
                System.out.println(vector[i]);

            }
        }
    }
}
