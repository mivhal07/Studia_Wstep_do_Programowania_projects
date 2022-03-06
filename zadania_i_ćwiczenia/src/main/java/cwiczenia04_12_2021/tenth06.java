package cwiczenia04_12_2021;

import java.util.Arrays;

public class tenth06 {

    public static void main(String[] args) {

        int[][] tab = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {9, 8, 7, 6, 5, 4, 3, 2, 1}};

        int[][] tab2 = new int[tab.length][tab[1].length];

        for (int i = 0; i < tab.length; i++) {
            tab2[i] = Arrays.copyOf(tab[i], tab[i].length);
            System.out.println(tab2[i]);
        }
    }
}
