package Kolos.kolokwium13_11_2021;

import java.util.Scanner;

public class Zadanie_4_przywitanie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String name = scanner.nextLine();
        System.out.println("Witaj " + name);
    }
}
