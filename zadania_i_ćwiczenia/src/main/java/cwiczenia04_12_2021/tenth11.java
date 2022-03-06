package cwiczenia04_12_2021;

import java.util.Scanner;

public class tenth11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] tab = new int[3][5];
        System.out.println("Podaj 15 liczb, abym wsadził je do 2D tablicy");
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                int i1 = scanner.nextInt();// a
                tab[i][j] = i1;
            }
        }

        //b
        sumaZbiorów(tab);

        //c
        System.out.println("Suma wszystkich liczb to: " + sumacałości(tab));

        //d
        System.out.println("Największa wartość z tablicy to: " + znajdzMax(tab));

        //wszędzie e

    }

    public static int znajdzMax(int[][] tab) {
        int max = tab[0][0];
        for (int j = 0; j < tab.length; j++) {
            for (int i = 1; i < tab.length; i++) {
                if (tab[j][i] > max)
                    max = tab[j][i];
            }
        }
        return max;
    }

    public static int sumacałości(int[][] tab) {
        int sumaCałości = 0;
        for (int[] ints : tab) {
            for (int i = 0; i < ints.length; i++) {
                sumaCałości += ints[i];
            }
        }
        return sumaCałości;
    }

    public static void sumaZbiorów(int[][] tab) {
        int sumaZbioru = 0;
        for (int[] ints : tab) {
            for (int i = 0; i < ints.length; i++) {
                sumaZbioru += ints[i];
            }
            System.out.println("Sumy zbiorów to: " + sumaZbioru);
            sumaZbioru = 0;
        }
    }
}
