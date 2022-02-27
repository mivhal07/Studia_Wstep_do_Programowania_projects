package cwiczenia27_02_2022;

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        double A = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę");
        double B = scanner.nextDouble();
        System.out.println("Podaj trzecią liczbę");
        double C = scanner.nextDouble();
        if (A > B && A > C) {
            if (B > C) {
                System.out.println(String.format("Kolejność liczb malejąco: %s, %s, %s", A, B, C));
            } else {
                System.out.println(String.format("Kolejność liczb malejąco: %s, %s, %s", A, C, B));
            }
        }
        if (B > A && B > C) {
            if (A > C) {
                System.out.println(String.format("Kolejność liczb malejąco: %s, %s, %s", B, A, C));
            } else {
                System.out.println(String.format("Kolejność liczb malejąco: %s, %s, %s", B, C, A));
            }
        }
        if (C > A && C > B) {
            if (A > B) {
                System.out.println(String.format("Kolejność liczb malejąco: %s, %s, %s", C, A, B));
            } else {
                System.out.println(String.format("Kolejność liczb malejąco: %s, %s, %s", C, B, A));
            }
        }

    }
}
