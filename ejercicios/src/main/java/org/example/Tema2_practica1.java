package org.example;

import java.util.Scanner;

public class Tema2_practica1 {
    static void main() {
        int dia_max = 31; //le damos un valor a dia_maximo que se puede poner
        int mes_max = 12; //le damos un valor a mes_maximo que se puede poner
        int anio_max = 2025; //le damos un valor a anio maximo que se puede poner
        int suma_fecha = 0; //le damos un valor aqui porque como esta dentro del try catch nos da error

        Scanner teclado = new Scanner(System.in); //creamos el objeto scanner para poder leer lo que escriba el usuario

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa)"); // le pedimos al usuario que nos diga su fecha

        String fecha = teclado.nextLine(); //el usuario pone su fecha

        int tamanio = fecha.length(); //nos da cuantas cifras tiene la fecha que nos intruducio el usuario

        if (tamanio < 10) { // si el numero de cifra es menor que 10, le dice al usuario que es muy corta la fecha y se sale del programa

            System.out.println("es muy cortito");
            return;

        }

        String dia = fecha.substring(0, 2); //agarra el dia que nacio el usuario
        String mes = fecha.substring(3, 5); //agarra el mes que nacio el usuario
        String anio = fecha.substring(6, 10); //agarra el anio que nacio el usuario

        boolean funcion = true; //creamos esta variable para saber si todo va bien o hay error

        try {
            int dia_int = Integer.parseInt(dia); //convertimos el dia en un numero entero
            int mes_int = Integer.parseInt(mes); //convertimos el mes en un numero entero
            int anio_int = Integer.parseInt(anio); //convertimos el anio en un numero entero
            suma_fecha = dia_int + mes_int + anio_int; //sumamos dia + mes + anio

            if (dia_int > dia_max || mes_int > mes_max || anio_int > anio_max || dia_int < 1 || mes_int < 1 || anio_int < 1900) { //si el dia, mes o anio son incorrectos muestra error
                System.out.println("formato introducido es icorrecto");
                funcion = false; //si hay error ponemos funcion en falso
            }else if (fecha.charAt(2) != '/' || fecha.charAt(5) != '/') { // si el usuario en la fecha no puso / o en la pocision que tiene que ir, le dira formato incorrecto
                System.out.println("Formato de barra incorrecto");
                funcion = false;
            }

        } catch (Exception e) { //si el usuario pone letras o algo mal entra aqui
            System.out.println("Formato incorrecto");
            funcion = false; //ponemos funcion en falso porque hay error
        }

        if (funcion) { //si funcion sigue siendo verdadero, quiere decir que todo esta bien
            String resultado = Integer.toString(suma_fecha); //pasamos la suma de la fecha a texto para poder separar los numeros
            String suma_string1 = resultado.substring(0, 1); //sacamos el primer numero de la suma
            String suma_string2 = resultado.substring(1, 2); //sacamos el segundo numero de la suma
            String suma_string3 = resultado.substring(2, 3); //sacamos el tercer numero de la suma
            String suma_string4 = resultado.substring(3, 4); //sacamos el cuarto numero de la suma

            int suma_int1 = Integer.parseInt(suma_string1); //pasamos el primer numero a entero
            int suma_int2 = Integer.parseInt(suma_string2); //pasamos el segundo numero a entero
            int suma_int3 = Integer.parseInt(suma_string3); //pasamos el tercer numero a entero
            int suma_int4 = Integer.parseInt(suma_string4); //pasamos el cuarto numero a entero

            System.out.println(dia + " + " + mes + " + " + anio + " = " + resultado); //mostramos la suma completa de la fecha
            int numero_suerte = suma_int1 + suma_int2 + suma_int3 + suma_int4; //sumamos los 4 numeros para sacar el numero de la suerte
            System.out.println("Tu numero de la suerte es: " + numero_suerte); //mostramos el numero de la suerte final
        }
    }
}
