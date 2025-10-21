package org.example;

import java.util.Scanner;

public class Tema2_practica2 {
    static void main() {
        double resultado = 0;
        double num2 = 0;
        double num = 0;
        String operacion = "";
        Scanner teclado = new Scanner(System.in);
        System.out.println("***** Bienvenido a la calculadora rapida *****");
        System.out.println("> Introduce el operando: ");
        try {
            num = teclado.nextDouble();
        } catch (Exception e){
            System.out.println("Formato del numero incorrecto");
            return;
        }

        System.out.println("---------------------------");
        System.out.println("[+] --> sumar");
        System.out.println("[-] --> restar");
        System.out.println("[x] --> multiplicar");
        System.out.println("[/] --> dividir");
        System.out.println("[R] --> raiz cuadrada");

        System.out.println("Elige una operacion");

        operacion = teclado.next();
        operacion = operacion.toLowerCase();

        if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x") || operacion.equals("/")) {
            try {
                System.out.println("> Introduce el operando: ");
                num2 = teclado.nextDouble();
           }catch (Exception e){
               System.out.println("Formato del numero 2 incorrecto");
                return;
            }
        }

        switch (operacion.toUpperCase()) {
            case "+": {
                resultado = num + num2;
                break;
            }
            case "-": {
                resultado = num - num2;
                break;
            }
            case "X": {
                resultado = num * num2;
                break;
            }
            case "/": {
                resultado = num / num2;
                break;
            }
            case "R": {
                resultado = Math.sqrt(num);
                break;
            }
            default: {
                System.out.println("la operacion es incorrecta");
            }
        }
            if (operacion.equals("r")){
                System.out.println("El resultado de " + num + " es = " + resultado);

            }else {
                System.out.println("El resultado de " + num + operacion + num2 + " es = " + resultado);
               }

    }
}
