package cwiczenia27_11_2021;

import java.util.Scanner;

public class fifth06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        number = number * number * number;
        System.out.println("Twoja liczba podniesiona na sześcianu to: " + number);
    }
}
