package org.example;

import java.util.Scanner;

public class Main {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Kombinasyon hesaplamak için metod
    public static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n değerini girin: ");
        int n = scanner.nextInt();

        System.out.print("r değerini girin: ");
        int r = scanner.nextInt();

        if (n < 0 || r < 0 || r > n) {
            System.out.println("Geçersiz giriş! n ve r pozitif tamsayılar olmalı ve r'nin n'den küçük veya eşit olması gerekir.");
        } else {
            int result = combination(n, r);
            System.out.println("C(" + n + "," + r + ") = " + result);
        }

    }
}