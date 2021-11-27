package cwiczenia27_11_2021;

import java.util.Scanner;

public class fifth02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        int x = scanner.nextInt();
        for (int i = x; i <= x + 10; i++) {
            System.out.print(i + ", ");
        }
    }
}