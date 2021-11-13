package Kolos;

import java.util.Scanner;

public class Zadanie_2_suma_3_liczb {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();
        System.out.println("Podaj trzecią liczbę");
        int c = scanner.nextInt();
        int sum = a + b + c;
        System.out.println("__________________");
        System.out.println("Suma tych liczb: " + sum);
    }
}
