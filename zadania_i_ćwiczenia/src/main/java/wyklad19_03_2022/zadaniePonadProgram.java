package wyklad19_03_2022;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class zadaniePonadProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miesiąc i rok w formacie 'MM-RRRR', a ja pokażę Ci, ile dni jest w tym miesiącu");
        String s = scanner.nextLine();
        showDays(s);
    }

    public static void showDays(String s) {
        String[] split = s.split("-");
        int i1 = Integer.parseInt(split[0]);
        int i2 = Integer.parseInt(split[1]);
        Calendar kalendarz = new GregorianCalendar(i2, i1, 0);
        int dniMiesiac = kalendarz.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Ilość dni w podanym miesiącu: " + dniMiesiac);
    }


}
