package Kolos.kolokwium13_11_2021;

import java.util.Scanner;

public class Zadanie_3_funkcja_liniowa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double x = 0;
        double b = 0;
        System.out.println("Podaj wartość dla 'a'.");
        a = scanner.nextDouble();
        System.out.println("Podaj wartość dla 'b'.");
        b = scanner.nextDouble();
        System.out.println("Podaj wartość dla 'x'.");
        x = scanner.nextDouble();
        double y = a * x + b;

        System.out.println("Wartość 'y' dla tej funkcji liniowej to: " + y);
    }
}
