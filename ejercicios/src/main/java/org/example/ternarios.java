package org.example;

public class ternarios {
    static void main() {

        int a = 1, b = 2, c = 3, resultado;

        resultado = ++a < c && a != b ? a -= b:
                c-- == b || --b == c ? b += c:
                        b <= a++ && a > c ? c + c: c--;
        System.out.println(resultado);
    }
}
