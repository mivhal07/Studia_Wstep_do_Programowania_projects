package wyklad05_03_2022;

import java.util.Scanner;

public class eleventh09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            if (s.equals("")) {
                break;
            } else {
                System.out.println(replace(s));
            }
        }

    }

    public static String replace(String str) {
        return str.replace(" ", "");
    }
}
