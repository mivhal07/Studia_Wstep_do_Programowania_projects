package wyklad05_03_2022;

import java.util.Scanner;

public class eleventh01 {

    public static void main(String[] args) {

        readStr1(15);

    }

    public static void readStr1(int n) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz coś");
        String s = scanner.nextLine();
        String substring = s.substring(0, n);
        System.out.println(substring);
    }
}
