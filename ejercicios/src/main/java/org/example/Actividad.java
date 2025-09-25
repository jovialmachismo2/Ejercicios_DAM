package org.example;


import java.util.Scanner;

public class Actividad {

    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("What your name?: ");
        String nombre = teclado.nextLine();

        System.out.println("Cual es tu curso: ");
        String curso = teclado.next();

        System.out.println("Hola " + nombre + " Pebienvenid@ al curso " + curso);

        System.out.println("Introduce un numero");
        int num1 = teclado.nextInt();

        System.out.println("Introduce otro numero");
        int num2 = teclado.nextInt();

        int resultado = num1 + num2;
        System.out.println("La suma de estos numeros es " + resultado);
    }
}
