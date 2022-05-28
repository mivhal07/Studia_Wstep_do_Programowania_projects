package Kolos.kolokwium28_05_2022;

import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Podaj liczbę MNIEJSZĄ od 10 LUB RÓWNĄ 10");
        while (true) {
            n = scanner.nextInt();
            if (n <= 10) {
                break;
            } else {
                System.out.println("Nie prawidłowa wartość, MUSI BYĆ MNIEJSZA LUB RÓWNA 10");
            }
        }
        System.out.println(minValue(wczytaj(n)));

    }

    public static int[][] wczytaj(int n) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teraz zajmiemy się wprowadzaniem elementów do tablicy 2D");
        int[][] tab = new int[n][n];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.println(String.format("Podaj %s z %s liczb do tablicy", count + 1, n * n));
                tab[i][j] = scanner.nextInt();
                count++;
            }
        }
        return tab;
    }

    public static int minValue(int[][] tab) {
        int sum = 0;
        int min = tab[0][0];
        for (int i = tab.length - 1; i >= 0; i--) {
            for (int j = 0; j < tab[i].length; j++) {
                if (j == 0) {
                    sum = 0;
                } else {
                    sum = sum + tab[i][j];
                    if (sum < min) {
                        min = sum;
                    }
                }
            }
        }
        return min;
    }
}
