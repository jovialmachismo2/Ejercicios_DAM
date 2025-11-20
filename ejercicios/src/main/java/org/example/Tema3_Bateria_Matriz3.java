package org.example;

import java.util.Scanner;

public class Tema3_Bateria_Matriz3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos alumnos tienes");
        int alumnos = teclado.nextInt();

        System.out.println("Cuantas asignaturas cursas");
        int asignaturas = teclado.nextInt();
        teclado.nextLine();
        String notas[][] = new String[alumnos+1][asignaturas+1];


        notas[0][0] = "Estudiantes";

        for (int i = 1; i < notas.length; i++) {
            System.out.println("Introduce el nuombre del alumno " + i + " :");
            notas[i][0] = teclado.next();
        }

        for (int i = 1; i < notas[0].length ; i++) {
            System.out.println("Introduce asignatura " + i);
            notas[0][i] = teclado.next();
        }

        for (int i = 1; i < notas.length ; i++) {
            for (int j = 1; j < notas[i].length; j++) {
                System.out.println("Introduca la nota del alumno " + notas[i][0] + " Para la asignatura de " + notas[0][j]);
                notas[i][j] = teclado.next();
            }
        }

        for (String fila[]: notas){
            for (String valor : fila){

                System.out.print(valor + " ");
            }
            System.out.println();
        }

    }
}