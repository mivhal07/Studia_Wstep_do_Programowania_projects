package wykład04_12_2021;

import java.util.Arrays;

public class tenth09 {

    public static void main(String[] args) {

        int[][] tab = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}};

        wyswietlanie(tab);

        System.out.println("");

        podwajanie(tab);
        wyswietlanie(tab);


    }

    public static int[][] podwajanie(int[][] tab) {

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (int) Math.pow(tab[i][j], 2);
            }
        }

        return tab;
    }

    public static void wyswietlanie(int[][] tab) {

        for (int[] ints : tab) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
