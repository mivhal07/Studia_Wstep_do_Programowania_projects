package pierwszy_wykład;

import java.util.Scanner;

public class Third04 {

    public static void main(String[] args) {

        double x = getDouble();
        System.out.println("Podana liczba to: " + x);
        // Nie potrafię tu zamienić na notację.
        System.out.println("Podana liczba w notacji wykładniczej to: " + x);

    }

    public static double getDouble() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę zmiennoprzecinkową.");
        return scanner.nextDouble();
    }
}
