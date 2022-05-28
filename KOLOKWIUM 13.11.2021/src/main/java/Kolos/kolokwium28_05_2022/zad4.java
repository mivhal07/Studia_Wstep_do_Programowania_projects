package Kolos.kolokwium28_05_2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zad4 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wybierz co chcesz zrobić:");
            System.out.println("1 - jeżeli chcesz dodać coś do listy");
            System.out.println("2 - ");
            System.out.println("3 - jeżeli chcesz zobaczyć co jest w liście");
            if (scanner.nextInt() == 1) {
                dodajDoListy(list);
            } else if (scanner.nextInt() == 2) {
                System.out.println("Funkcja niedostępna, gdyż w Javie nie mamy wskażników");
            } else if (scanner.nextInt() == 3) {
                wyświetlElementy(list);
            } else {
                System.out.println("Skończyłem działanie programu, Do widzenia :)");
                break;
            }
        }
    }

    public static void dodajDoListy(List<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wczytaj wartość lub wartości do listy, jeżeli chcesz przestać wprowadź coś innego niż Integer");
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            list.add(i);
        }
        System.out.println("Skończono wczytywanie do listy");
    }

    public static void wyświetlElementy(List<Integer> list) {
        System.out.println(list);
    }
}
