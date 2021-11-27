package cwiczenia27_11_2021;

import java.util.Scanner;

public class sixth07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę zmiennoprzecinkową");
        while (scanner.hasNextDouble()) {
            double liczba1 = scanner.nextDouble();
            System.out.println("Podaj drugą liczbę zmiennoprzecinkową");
            double liczba2 = scanner.nextDouble();
            System.out.println("Wynikiem działania jest: " + calculate(liczba1,liczba2));
        }

    }

    public static double calculate(double liczba1, double liczba2){

        double różnica = liczba1 - liczba2;
        double iloczyn = liczba1 * liczba2;
        double result = różnica / iloczyn;

        return result;
    }
}
