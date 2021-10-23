package UWM;

import java.util.Scanner;

public class Third02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kod ASCII");
        int ascii = scanner.nextInt();
        char asciiInChar = (char) ascii;
        System.out.println(asciiInChar);
    }
}
