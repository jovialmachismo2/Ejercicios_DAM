package org.example;

import java.util.Arrays;

public class burbuja {
    static void main() {
        int vector[] = {5, 3, 8, 4, 2};
        int aux;
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length - i - 1; j++) {
                System.out.println(vector[j]);
                if (vector[j] > vector[j + 1]) {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                    System.out.println(aux);
                }
            }
            System.out.println();
            System.out.println(Arrays.toString(vector));
        }
        System.out.println();
        System.out.println(Arrays.toString(vector));
    }
}
