package org.example;
import java.util.Scanner;

public class Tema2_practica2 {
    static void main() {
        double resultado = 0; //guardará el resultado final de la operación
        double num2 = 0; //segundo número que usará el usuario
        double num = 0; //primer número que usará el usuario
        String operacion = ""; //guardará el tipo de operación que elija el usuario

        Scanner teclado = new Scanner(System.in);

        System.out.println("***** Bienvenido a la calculadora rapida *****"); //mensaje de bienvenida
        System.out.println("> Introduce el operando: "); //pedimos al usuario que ponga el primer número

        try {
            num = teclado.nextDouble(); //guardamos el primer número introducido por el usuario
        } catch (Exception e){ //si el usuario no pone un número
            System.out.println("Formato del numero incorrecto"); //mostramos mensaje de error
            return; //terminamos el programa
        }

        //mostramos el menú de operaciones
        System.out.println("---------------------------");
        System.out.println("[+] --> sumar");
        System.out.println("[-] --> restar");
        System.out.println("[x] --> multiplicar");
        System.out.println("[/] --> dividir");
        System.out.println("[R] --> raiz cuadrada");

        System.out.println("Elige una operacion"); //le pedimos al usuario que elija una operación

        operacion = teclado.next(); //guardamos la operación que escribió el usuario
        operacion = operacion.toLowerCase(); //pasamos la operación a minúsculas para que no importe si la escribió en mayúscula o minúscula

        //si la operación necesita un segundo número, lo pedimos aquí
        if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x") || operacion.equals("/")) {
            try {
                System.out.println("> Introduce el operando: "); //pedimos el segundo número
                num2 = teclado.nextDouble(); //guardamos el segundo número
            } catch (Exception e){ //si el formato no es correcto
                System.out.println("Formato del numero 2 incorrecto"); //mostramos error
                return; //salimos del programa
            }
        }

        //según la operación elegida, hacemos el cálculo correspondiente
        switch (operacion) {
            case "+": { //si elige sumar
                resultado = num + num2; //sumamos los dos números
                break;
            }
            case "-": { //si elige restar
                resultado = num - num2; //restamos los dos números
                break;
            }
            case "x": { //si elige multiplicar
                resultado = num * num2; //multiplicamos los dos números
                break;
            }
            case "/": { //si elige dividir
                resultado = num / num2; //dividimos el primero entre el segundo
                if (num2 == 0){ //si el segundo número es 0
                    System.out.println("El resultado es " + resultado); //mostramos el resultado
                    return; //salimos del programa
                }
                break;
            }
            case "r": { //si elige raíz cuadrada
                resultado = Math.sqrt(num); //calculamos la raíz cuadrada del número
                if (num <= 0 ){ //si el número es negativo o cero
                    System.out.println("No se puede hacer la raiz cuadrada"); //mostramos error
                    operacion = operacion.toUpperCase(); //convertimos la operación a mayúscula
                }
                break;
            }
            default: { //si el usuario escribió una operación que no existe
                System.out.println("la operacion es incorrecta"); //mostramos error
            }
        }

        //aquí mostramos el resultado dependiendo del tipo de operación
        if (operacion.equals("r")){ //si fue raíz cuadrada
            System.out.println("El resultado de " + num + " es = " + resultado); //mostramos el resultado
        } else if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x") || operacion.equals("/")){ //si fue una operación con dos números
            System.out.println("El resultado de " + num + operacion + num2 + " es = " + resultado); //mostramos el resultado completo
        }

    }
}

