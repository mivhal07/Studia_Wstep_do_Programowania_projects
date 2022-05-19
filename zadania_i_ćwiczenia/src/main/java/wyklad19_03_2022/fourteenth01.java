package wyklad19_03_2022;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class fourteenth01 {

    public static long diffInDays3(Date d1, Date d2) {
        return Math.round((d1.getTime() - d2.getTime()) / 86400000.0);
    }


    public static void main(String[] args) {

        System.out.println("Podaj datę w formacie DD-MM-RRRR a ja powiem Ci ile dni jest, od początku roku do danego dnia włącznie");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split("-");
        int s1 = Integer.parseInt(split[0]);
        int s2 = Integer.parseInt(split[1]);
        int s3 = Integer.parseInt(split[2]);

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        c1.set(s3, 1, 01);
        c2.set(s3, s2, s1);

        System.out.println("Ilość dni to: " + diffInDays3(c2.getTime(), c1.getTime()) + 1);


    }
}
