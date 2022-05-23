package cwiczeniaJKrzanowski.rozdzial4;

import java.util.Arrays;

public class zad4_2_12 {

    public static void main(String[] args) {

        nameOfFunction1(1, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
       // nameOfFunction2(1, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});

    }

    // A
    public static void nameOfFunction1(int j, int[] tab) {
        if (j <= 0) {
            System.out.println("Liczba nie jest dodatnia");
        } else {
            for (int i = 0; i < tab.length / 2; i++) {
                int temp = tab[i];
                tab[i] = tab[tab.length - i - 1];
                tab[tab.length - i - 1] = temp;
            }
            System.out.println(Arrays.toString(tab));
        }
    }

    //B
    public static void nameOfFunction2(int j, int[] tab) {
        int zero = tab[0];
        for (int i = tab.length; i >= 0; i--) {
            tab[i] = tab[i - 1];
        }
        tab[tab.length] = zero;
        System.out.println(Arrays.toString(tab));

    }


}
