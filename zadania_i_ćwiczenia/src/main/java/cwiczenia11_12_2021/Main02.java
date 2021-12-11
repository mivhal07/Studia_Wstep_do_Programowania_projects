package cwiczenia11_12_2021;

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {

//        wczytaj do tablicy 10 liczb i wyświetl na ekranie w takiej samej i w odwrotnej kolejności

        metodaZFor();
        metodaZWhile();
    }

    public static void metodaZFor() {

        System.out.println("Wpisz 10 dowolnych liczb do tablicy");
        double[] tab = new double[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            System.out.println(String.format("Wprowadź liczbę na miejsce %s w tablicy", i));
            double v = scanner.nextDouble();
            tab[i] = v;
        }

        for (double v : tab) {
            System.out.print(v + " ");
        }

        System.out.println("");
        System.out.println("Odwrotnie:");

        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.print(tab[i] + " ");
        }
    }

    public static void metodaZWhile() {
        System.out.println("Wpisz 10 dowolnych liczb do tablicy");
        double[] tab = new double[10];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < tab.length) {
            System.out.println(String.format("Wprowadź liczbę na miejsce %s w tablicy", i));
            double v = scanner.nextDouble();
            tab[i] = v;
            i++;
        }

//tutaj jest iteracja i z while to niestety nie działa
        for (double v : tab) {
            System.out.print(v + " ");
        }

        System.out.println("");
        System.out.println("Odwrotnie:");

        i = tab.length - 1;
        while (i >= 0) {
            System.out.print(tab[i] + " ");
            i--;
        }
    }
}
