package org.example;

public class Tema2_bateria4 {
    static void main() {
        String texto = "Hola Mundo, bienvenido a Mundo. Mundo es genial.";
        String palabra = "Mundo";

        int texto_tamanyio = texto.length();
        int palabra_tamanyo = palabra.length();
        String frase_sin = texto.replace(palabra,"");
        int conteo = frase_sin.length();
        int resta = texto_tamanyio - conteo;
        int resultado = resta / palabra_tamanyo;
        System.out.println(resultado);

    }
}
