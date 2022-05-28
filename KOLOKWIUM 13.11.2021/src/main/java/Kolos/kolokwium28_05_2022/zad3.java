package Kolos.kolokwium28_05_2022;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zad3 {

    public static void main(String[] args) {
        int numberOfMonth = 0;
        int dayOfMonth = 0;
        double weather = 0;
        int[][] tab = {{},{}};
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Podaj miesiąc cyfrą np. 8 - sierpień");
                numberOfMonth = scanner.nextInt();
                if (numberOfMonth > 0 && numberOfMonth <= 12) {
                    tab[0][0]=numberOfMonth;
                    break;
                } else {
                    System.out.println("Nie prawidłowa wartość, MUSI BYĆ WIĘKSZA OD 0 I MNIEJSZA OD 12 oraz MUSI BYĆ LICZBĄ");
                }
            }
            while (true) {
                System.out.println("Podaj dzień miesiąca cyfrą np. 8");
                dayOfMonth = scanner.nextInt();
                if (dayOfMonth > 0 && dayOfMonth <= 31) {
                    tab[0][1]=dayOfMonth;
                    break;
                } else {
                    System.out.println("Nie prawidłowa wartość, MUSI BYĆ WIĘKSZA OD 0 I MNIEJSZA OD 31 oraz MUSI BYĆ LICZBĄ");
                }
            }
            while (true) {
                System.out.println("Podaj średnią temperaturę tego dnia");
                weather = scanner.nextInt();
                tab[0][2]=Integer.parseInt(String.valueOf(weather));
                break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Zła wartość, spróbuj od nowa uruchomić program");
        }
        while (true) {
            System.out.println("Wybierz co chcesz zrobić:");
            System.out.println("1 - jeżeli chcesz dodać dane odnośnie innego dnia");
            System.out.println("2 - ");
            System.out.println("3 - jeżeli chcesz obliczyć średnią temperaturę wśród dni które wprowadziłeś");
            if (scanner.nextInt() == 1) {

            } else if (scanner.nextInt() == 2) {
                System.out.println("Funkcja niedostępna, gdyż w Javie nie mamy wskażników");
            } else if (scanner.nextInt() == 3) {

            } else {
                System.out.println("Skończyłem działanie programu, Do widzenia :)");
                break;
            }
        }
    }
}
