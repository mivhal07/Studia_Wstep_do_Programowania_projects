package Kolos.kolokwium22_01_2022;

import java.util.Scanner;

public class Zadanie_1_rownanie {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Równanie to: 2*a*x^2+b*x-4=0");
        System.out.println("Wprowadź A");
        double A = scanner.nextDouble();
        System.out.println("Wprowadź B");
        double B = scanner.nextDouble();
        double C = -4;
        if (A == 0) {
            System.out.println("A = 0, równanie sprowadza się do równania liniowego i wtedy:");
            if (B == 0) {
                System.out.println("Równanie sprzeczne");
            } else {
                double result = -C / B;
                System.out.println("Wynikiem równania liniowego jest: " + result);
            }
        } else {
            double delta = Math.pow(B, 2) - (4 * A * C);
            if (delta < 0) {
                System.out.println("Nie posiada rozwiązań, delta < 0");
            } else if (delta == 0) {
                double x = -B / (2 * A);
                System.out.println("X = " + x);

            } else if (delta > 0) {
                double pierwiastekZDelty = Math.sqrt(delta);
                double x1 = (-B - pierwiastekZDelty) / (2 * A);
                double x2 = (-B + pierwiastekZDelty) / (2 * A);
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            }
        }

    }
}
