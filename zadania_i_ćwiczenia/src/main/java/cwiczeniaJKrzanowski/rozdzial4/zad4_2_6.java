package cwiczeniaJKrzanowski.rozdzial4;

import java.util.Arrays;

public class zad4_2_6 {

    public static void main(String[] args) {

        copyArray(1, new int[]{1, 2, 3, 4, 5, 6, 7}, new int[0]);
        copyReverseArray(1, new int[]{1, 2, 3, 4, 5, 6, 7}, new int[0]);


    }

    // A
    public static void copyArray(int i, int[] tab, int[] tab2) {
        if (i <= 0) {
            System.out.println("Liczba nie jest dodatnia");
        } else {
            tab2 = Arrays.copyOf(tab, tab.length);
            System.out.println(Arrays.toString(tab2));
        }
    }

    // B
    public static void copyReverseArray(int j, int[] tab, int[] tab2) {
        if (j <= 0) {
            System.out.println("Liczba nie jest dodatnia");
        } else {
            for (int i = 0; i < tab.length / 2; i++) {
                int temp = tab[i];
                tab[i] = tab[tab.length - i - 1];
                tab[tab.length - i - 1] = temp;
            }
            tab2 = tab;
            System.out.println(Arrays.toString(tab2));
        }
    }
}
