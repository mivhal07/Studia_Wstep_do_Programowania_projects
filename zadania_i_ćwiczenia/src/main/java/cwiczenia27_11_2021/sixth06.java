package cwiczenia27_11_2021;

import java.util.Scanner;

public class sixth06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo, abym mógł je odwrócić");
        StringBuilder builder = new StringBuilder(scanner.nextLine());
        StringBuilder reverse = builder.reverse();
        System.out.println(reverse);
    }
}
