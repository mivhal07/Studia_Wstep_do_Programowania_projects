package Kolos.kolokwium26_03_2022;

import java.util.Scanner;

public class Zadanie_1_rownanie {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj parametr a");
        int a = scanner.nextInt();
        System.out.println("Podaj parametr b");
        int b = scanner.nextInt();
        System.out.println("Podaj parametr c");
        int c = scanner.nextInt();
        wyswitlanieiwynik(a, b, c);
        scanner.close();
    }

    public static void wyswitlanieiwynik(int a, int b, int c) {
        double delta = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
        if (delta < 0) {
            System.out.println("Brak rozwiązania");
        } else if (delta == 0) {
            int x = -b / (2 * a);
            System.out.println("Równanie ma jedno rozwiązanie \nx = " + x);
        } else if (delta > 0) {
            double x1 = (-b + delta) / (2 * a);
            double x2 = (-b - delta) / (2 * a);
            System.out.println("Równanie ma dwa rozwiązania \nx1 = " + x1 + "\nx2 = " + x2);
        }
    }
}
