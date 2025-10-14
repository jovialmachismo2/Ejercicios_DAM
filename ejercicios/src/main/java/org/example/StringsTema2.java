package org.example;

public class StringsTema2 {
    static void main() {
        String frase = "Al palo JuanFran Atletico de Madrid palo";

        int tamanio = frase.length();

        System.out.println(tamanio);
        System.out.println(frase.charAt(8));
        String trozo = frase.substring(8,16);
        System.out.println(trozo);
        String trozo_final = frase.substring(17);
        System.out.println(trozo_final);

        int posicion = frase.indexOf("palo");
        System.out.println(posicion);
        int posicion2 = frase.indexOf("palo" ,10);
        System.out.println(posicion2);
        int posicion_ultimo = frase.lastIndexOf("palo");
        System.out.println(posicion_ultimo);
        String frase_mayusculas = frase.toUpperCase();
        System.out.println(frase_mayusculas);
        String frase_minusculas = frase.toLowerCase();
        System.out.println(frase_minusculas);
        String base_datos = "Raul                  ";
        System.out.println(base_datos.trim() + " - " + base_datos + "#");

        boolean igual = base_datos.trim().equals("Raul");
        System.out.println(igual);
        boolean igual_sin_mayusculas = "Raul".equalsIgnoreCase("raul");
        System.out.println(igual_sin_mayusculas);
        String frase_remplazo = frase.replace("palo", "florentino");
        System.out.println(frase_remplazo);

        String equipo = "Ladrones";
        System.out.println(frase.concat(equipo));

    }
}
