package cwiczenia07_11_2021;

import java.util.Scanner;

public class Forth01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź swoje imię");
        String firstName = scanner.nextLine();
        System.out.println("Wprowadź swoje nazwisko");
        String lastName = scanner.nextLine();
        System.out.println("");
        System.out.println(lastName + "," + firstName);

    }
}
