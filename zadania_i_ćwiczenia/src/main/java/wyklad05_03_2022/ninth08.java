package wyklad05_03_2022;

import java.util.Scanner;

public class ninth08 {

    public static void main(String[] args) {
        int liczba;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą, quit kończy program");
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("quit")) {
                break;
            }
            System.out.println("Podaj cyfrą na jaki system mam zmienić liczbę");
            int syst = scanner.nextInt();
            liczba = Integer.parseInt(s);
            System.out.println("Odpowiednik dwójkowy:");
            do_binar(liczba, syst);
            System.out.println("");
            System.out.println("Podaj liczbę całkowitą, quit kończy program");
        }

    }

    public static void do_binar(int n, int a) {//3103
        int r = 0;
        r = n % a;
        if (n >= a) {
            do_binar(n / a, a);
        }
        System.out.print(0 + r);
    }
}
