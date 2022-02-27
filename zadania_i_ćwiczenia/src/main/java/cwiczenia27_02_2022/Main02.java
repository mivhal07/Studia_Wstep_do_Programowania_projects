package cwiczenia27_02_2022;

import java.util.Arrays;
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

    public static void second() {
        double[] array = new double[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        double A = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę");
        double B = scanner.nextDouble();
        System.out.println("Podaj trzecią liczbę");
        double C = scanner.nextDouble();
        array[0] = A;
        array[1] = B;
        array[2] = C;
        Arrays.sort(array);
        System.out.println(String.format("Kolejność liczb malejąco: %s, %s, %s", array[2], array[1], array[0]));
    }
}
