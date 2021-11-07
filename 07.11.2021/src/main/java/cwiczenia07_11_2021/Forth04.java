package cwiczenia07_11_2021;

import java.util.Scanner;

public class Forth04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię");
        String name = scanner.nextLine();

        System.out.println("Podaj wzrost w centymetrach");
        double wzrost = scanner.nextDouble() / 100;

        returnedString(name);
        returnedDouble(wzrost);

    }

    private static void returnedString(String name) {
        System.out.print(name + ", masz ");
    }

    private static void returnedDouble(double wzrost) {

        System.out.println(wzrost + " metra wzrostu");
    }
}
