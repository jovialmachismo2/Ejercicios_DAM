package org.example;

import java.util.Scanner;

public class bateria_8 {
    static void main() {
        ejercicio1();
        //ejercicio2();
    }
    static void ejercicio1(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer lado del triangulo");
        double num1 = teclado.nextDouble();
        System.out.println("Introduce el segundo lado del triangulo");
        double num2 = teclado.nextDouble();
        System.out.println("Introduce el tercero lado del triangulo");
        double num3 = teclado.nextDouble();
        if (num1 == num2 && num2 == num3){
            System.out.println("Es un triangulo equilatero");

        } else if (num1 == num3 || num1 == num2 || num2 == num3){
            System.out.println("Es un triangulo isosceles");

        }else {
            System.out.println("Es un triangulo escaleno");
        }
    }
    static void ejercicio2(){

                Scanner teclado = new Scanner(System.in);

                double lado1, lado2, lado3;

                System.out.println("Introduce el primer lado del triángulo:");
                lado1 = teclado.nextDouble();

                System.out.println("Introduce el segundo lado del triángulo:");
                lado2 = teclado.nextDouble();

                System.out.println("Introduce el tercer lado del triángulo:");
                lado3 = teclado.nextDouble();

                // Comprobamos el tipo de triángulo
                if (lado1 == lado2 && lado2 == lado3) {
                    System.out.println("El triángulo es EQUILÁTERO");
                } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                    System.out.println("El triángulo es ISÓSCELES");
                } else {
                    System.out.println("El triángulo es ESCALENO");
                }
            }
        }
