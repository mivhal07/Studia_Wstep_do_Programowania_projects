package cwiczenia11_12_2021;

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {

//        wczytaj do tablicy 10 liczb i wyświetl na ekranie w takiej samej i w odwrotnej kolejności

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
}
