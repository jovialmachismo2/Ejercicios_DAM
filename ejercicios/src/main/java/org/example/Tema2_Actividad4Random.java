package org.example;

import java.util.Random;

public class Tema2_Actividad4Random {
    static void main() {
        Random aleatorio = new Random();
        int bucle = aleatorio.nextInt(8,13);
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contrasenya ="";
        String mayuscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minuscula = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        for (int i=0;i<bucle;i++){
            contrasenya += caracteres.charAt(aleatorio.nextInt(caracteres.length()-1));
            for (int a = 0; a < 4; a++){
                
            }

        }
        System.out.println(contrasenya);
    }
}
