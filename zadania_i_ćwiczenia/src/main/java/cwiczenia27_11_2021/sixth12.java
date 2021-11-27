package cwiczenia27_11_2021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sixth12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<StringBuilder> list = new ArrayList<>();

        System.out.println("Napisz linijki, które mam odwrócić, aby wyjść napisz 'quit'");
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            if (str.equals("quit")) {
                break;
            } else {
                StringBuilder builder = new StringBuilder(str);
                StringBuilder reversed = builder.reverse();
                list.add(reversed);
            }
        }
        scanner.close();
        System.out.println("");
        System.out.println("Odwrócone linijki:");
        for (StringBuilder s : list) {
            System.out.println(s);
        }

    }
}
