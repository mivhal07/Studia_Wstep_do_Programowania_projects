package wyklad05_03_2022;

import java.util.Scanner;

public class eleventh14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz słowo, a ja przekonwertuję to na znaki");
        String s = scanner.nextLine();
        for (char c : s.toCharArray()) {
            if (Character.isWhitespace(c)) {
                System.out.print("[ ] ");
            } else {
                System.out.print((int) c + " ");
            }
        }

    }
}
