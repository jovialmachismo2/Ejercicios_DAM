package org.example;
import java.util.Scanner;

public class practica_4 {

    static void main() {
        int num = 0, num2 = 0;
        boolean funcion = true;
        Scanner teclado = new Scanner(System.in);
        do {
            try {
                System.out.println("Intruduce el muliplicando 1: ");

                num = teclado.nextInt();

                funcion = false;
                if (num > 999){
                    funcion=true;
                    System.out.println("Solo puedes escribir un numero de tres cifras");

                }
                if (num < 100 & num >= 0 || num < -999){
                    funcion=true;
                    System.out.println("Solo puedes escribir un numero de tres cifras");
                }
            }catch (Exception e){

                funcion=true;
                System.out.println("Formato incorrecto");
            }

        }while (funcion);

        do {
            try {
                System.out.println("Intruduce el muliplicando 2: ");

                num2 = teclado.nextInt();

                funcion = false;

                if (num2 > 999){
                    funcion=true;
                    System.out.println("Solo puedes escribir un numero de tres cifras");
                }
                if (num2 < 100 & num2 >= 0 || num2 < -999){
                    funcion=true;
                    System.out.println("Solo puedes escribir un numero de tres cifras");
                }
            }catch (Exception e){

                funcion=true;
                System.out.println("Formato incorrecto");
            }

        }while (funcion);

        String numB = Integer.toString(num2);
        String numB_1 = numB.substring(0,1);
        String numB_2 = numB.substring(1,2);
        String numB_3 = numB.substring(2,3);


        if (num2 < 0){

            numB = Integer.toString(num2);
            numB_1 = numB.substring(1,2);
            numB_2 = numB.substring(2,3);
            numB_3 = numB.substring(3,4);

        }


        int num_6 = Integer.parseInt(numB_1);
        int num_7 = Integer.parseInt(numB_2);
        int num_8 = Integer.parseInt(numB_3);

        int proceso1 = num_8 * num;
        int proceso2 = num_7 * num;
        int proceso3 = num_6 * num;
        int total = num * num2;

        System.out.println("El producto de la mutiplicacion sera "+ total);


        System.out.println("   " + num);
        System.out.println("X  " + num2);
        System.out.println("------------");

        if (proceso1 < 1000){

            System.out.println("   " + proceso1);
        }else {
            System.out.println("  " + proceso1);
        }
        if (proceso2 < 1000){
            System.out.println("  " + proceso2 + "X" );
        }else{
            System.out.println(" " + proceso2 + "X" );

        }
        if (proceso3 < 1000) {
            System.out.println(" " + proceso3 + "XX");
        }else {
            System.out.println("" + proceso3 + "XX");
        }
        System.out.println("--------------");
        System.out.println(total);
    }

}