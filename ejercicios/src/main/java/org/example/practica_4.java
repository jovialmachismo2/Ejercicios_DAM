package org.example;
import java.util.Scanner;

public class practica_4 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Intruduce el muliplicando: ");

        int num = teclado.nextInt();

        String numC = Integer.toString(num);
        String numC_1 = numC.substring(0,1);
        String numC_2 = numC.substring(1,2);
        String numC_3 = numC.substring(2,3);
        int num_1 = Integer.parseInt(numC_1);
        int num_2 = Integer.parseInt(numC_2);
        int num_3 = Integer.parseInt(numC_3);

        System.out.println("Intruduce el muliplicando: ");

        int num2 = teclado.nextInt();

        String numB = Integer.toString(num2);
        String numB_1 = numB.substring(0,1);
        String numB_2 = numB.substring(1,2);
        String numB_3 = numB.substring(2,3);
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