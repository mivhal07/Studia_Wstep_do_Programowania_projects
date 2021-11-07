package cwiczenia07_11_2021;

import java.util.Scanner;

public class Forth05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię i nazwisko");
        String fullName = scanner.nextLine();
        System.out.println(" ");
        System.out.println(fullName);
        int count = 0;
        fullName.replace(" ","");
        char[] chars = fullName.toCharArray();
        for (char aChar : chars) {
            count++;
        }
        System.out.println(count);

        // Nie da rady zrobić dalszej częsci zadania tutaj, lub nie wiem jak to tutaj
        // zrobić.

    }
}
