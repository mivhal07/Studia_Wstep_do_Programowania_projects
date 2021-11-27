package cwiczenia27_11_2021;

import java.util.Scanner;

public class sixth05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość wierszy");
        int x = scanner.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println("Podaj liczbę do obliczania w komórkach");
            int number = scanner.nextInt();
            System.out.println("------------------------------------------");
            System.out.println("|                |              |        |");
            System.out.println(String.format("|       %s        |       %s      |    %s   |", number, number * number, number * number * number));
            System.out.println("|                |              |        |");
            System.out.println("------------------------------------------");
        }
    }
}
