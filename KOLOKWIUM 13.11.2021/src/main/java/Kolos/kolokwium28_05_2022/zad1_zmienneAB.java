package Kolos.kolokwium28_05_2022;

import java.util.Scanner;

public class zad1_zmienneAB {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zmienną A");
        int A = scanner.nextInt();
        System.out.println("Podaj zmienną B");
        int B = scanner.nextInt();
        System.out.println(nameOfFunction(A, B));
    }

    public static double nameOfFunction(int A, int B) {
        if (B < A) {
            return B + A;
        } else {
            return B * A;
        }
    }
}
