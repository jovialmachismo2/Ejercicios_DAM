package org.example;

public class Bucles_Anidados {
    static void main() {

        externo:

        for (int i=0 ; i<9;i++){
            System.out.println("Soy el interno con i = " + i);
            interno:
            for (int j=10;j>=0;j--){
                System.out.println("Soy el interno con j = " + j);
                if (j==5){
                    break;

                }

            }

        }
    }
}
