package org.example; //

import java.util.Scanner;

public class Tema2_practica3 {
    static void main() {

        int resultado = 0; //guardará el resultado parcial de las multiplicaciones
        int contador = 10; //contador que se usa como peso del ISBN (empieza en 10)
        String menu = ""; //guardará la opción que elija el usuario en el menú
        int total = 0; //acumula la suma total del cálculo del ISBN
        int dudas = 0; //contará cuántos signos de '?' hay en el ISBN
        int posicionDuda = 0; //guardará la posición donde está el signo '?'
        int valor_poscicion = 0; //guardará el valor correspondiente al signo '?'
        String isbn = ""; //guardará el número ISBN que escriba el usuario
        int valor = 0; //guardará el valor que sustituye el '?'

        Scanner teclado = new Scanner(System.in); //creamos el objeto Scanner para leer datos

        //mostramos el menú de opciones
        System.out.println("Comprobar ISBN:");
        System.out.println("1. Comprobar ISB");
        System.out.println("2. Reparar ISBN");
        System.out.println("X. Salir del programa");

        menu = teclado.next(); //el usuario elige una opción
        menu = menu.toLowerCase(); //convertimos la opción a minúsculas para que no importe cómo la escribió

        //si el usuario eligió 1 o 2, le pedimos que introduzca el ISBN
        if (menu.equals("1") || menu.equals("2")) {
            System.out.println("Introduce el ISBN: ");
            isbn = teclado.next();
            if (isbn.length() != 10) {
                System.out.println("ISBN NO TIENE 10 CIFRAS");
                return;
            }

            for (int i = 0; i < 10; i++) {
                char character = isbn.toLowerCase().charAt(i); //guardamos el carácter actual (convertido a minúscula)

                if (i == 9 && character == 'x') { //si el último carácter es una 'x', vale por 10
                    resultado = contador * 10;
                    total += resultado;
                } else if (character == '?') { //si hay un signo de pregunta
                    dudas++; //aumentamos el contador de dudas
                    posicionDuda = i; //guardamos la posición donde está '?'
                    valor_poscicion = contador; //guardamos el peso (valor del contador)
                } else {
                    try {
                        int num = Integer.parseInt(String.valueOf(isbn.charAt(i))); //convertimos el carácter a número

                        resultado = contador * num; //multiplicamos el número por su peso (contador)
                        total = resultado + total; //sumamos al total

                    } catch (NumberFormatException e) { //si hay un carácter que no sea número o X
                        System.out.println("No se puede calcular el ISBN"); //mostramos error
                        return; //terminamos el programa
                    }
                }

                contador--;
            }

        }
            //bucle que recorre todos los caracteres del ISBN uno por uno

            //según lo que eligió el usuario, hacemos una cosa u otra
            switch (menu) {
                case "1": //opción 1 = comprobar ISBN

                    if (dudas > 0) { //si hay un signo de pregunta, no se puede validar
                        System.out.println("No se puede validar el ISBN con '?'.");
                        return; //terminamos el programa
                    }

                    if (total % 11 == 0) { //si el total es múltiplo de 11, el ISBN es válido
                        System.out.println("El ISBN es valido");
                    } else {
                        System.out.println("El ISBN no es valido"); //si no es múltiplo de 11, no es válido
                    }

                    break;

                case "2": //opción 2 = reparar ISBN con un signo '?'
                    if (dudas != 1) { //si no hay exactamente un signo de duda, no se puede reparar
                        System.out.println("Para reparar debe haber exactamente un '?' (encontrados: " + dudas + ")");
                        return; //terminamos el programa
                    }

                    boolean encontrado = false; //para saber si encontramos el valor correcto


                    //probamos valores del 0 al 10 para ver cuál hace que el ISBN sea válido
                    for (int candidato = 0; candidato <= 10; candidato++) {
                        if (posicionDuda != 9 && candidato == 10) continue; //solo el último puede ser X (10)
                        int prueba = total + candidato * valor_poscicion; //hacemos la prueba con el número candidato
                        if (prueba % 11 == 0) { //si es múltiplo de 11, encontramos el correcto
                            encontrado = true;
                            valor = candidato;
                            break; //salimos del bucle
                        }
                    }

                    if (encontrado) { //si encontramos el número correcto
                        String reparado;
                        if (posicionDuda == 9 && valor == 10) { //si la última posición es una X
                            System.out.println("El número para reparar el ISBN es X (10)");
                            reparado = isbn.substring(0, posicionDuda) + "X" + isbn.substring(posicionDuda + 1); //reemplazamos por X
                        } else {
                            System.out.println("El número para reparar el ISBN es " + valor);
                            reparado = isbn.substring(0, posicionDuda) + valor + isbn.substring(posicionDuda + 1); //reemplazamos el '?' por el número encontrado
                        }
                        System.out.println("ISBN reparado: " + reparado); //mostramos el ISBN ya corregido
                    } else {
                        System.out.println("No se encontró un número que valide el ISBN."); //si no se encontró ninguno válido
                    }
                    break;

                case "x": //si el usuario eligió salir
                    System.out.println("CHAU");
                    break; //no hacemos nada, el programa termina

                default: //si la opción no existe
                    System.out.println("Opción no valida.");
            }
        }
    }
