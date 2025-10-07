package org.example;

import java.util.Scanner;

public class prueba_ejemplo {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int n = 4, s = 0, k;

        k = 2 * n - 1;

        while (k >= 1) {
            s += k;
            System.out.println(k);
            k = k - 2;
        }

        System.out.println(s);

    }
}
