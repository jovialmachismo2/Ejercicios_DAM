package org.example;

import java.util.Scanner;

public class Tema2_bateria3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("inserta un numero");
        int numero = teclado.nextInt();
        System.out.println("cuantas cifras queres eliminar");
        int quitar = teclado.nextInt();
        String numero_string = Integer.toString(numero);
        int tamanyo = numero_string.length();
        int nuevo_tamnyo = tamanyo - quitar;
        String resultado = numero_string.substring(0,nuevo_tamnyo);
        System.out.println(resultado);
    }
}
