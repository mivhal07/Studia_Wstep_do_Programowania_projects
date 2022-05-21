package cwiczeniaJKrzanowski.rozdzial4;

import java.util.Arrays;

public class zad4_2_1 {

    public static void main(String[] args) {

        giveMe0(1, new int[]{1, 2, 3, 4, 5, 6, 7});
        saveIndexes(1, new int[]{1, 2, 3, 4, 5, 6, 7});
        doubleValues(1, new int[]{1, 2, 3, 4, 5, 6, 7});
        bezwzgl(1, new int[]{1, 2, -3, 4, 5, 6, -7});

    }

    // A
    public static void giveMe0(int i, int[] tab) {
        if (i <= 0) {
            System.out.println("Podana liczba nie jest dodatnia");
        } else {
            for (int j = 0; j < tab.length; j++) {
                tab[j] = 0;
            }
        }
        System.out.println(Arrays.toString(tab));
    }

    // B
    public static void saveIndexes(int i, int[] tab) {
        if (i <= 0) {
            System.out.println("Podana liczba nie jest dodatnia");
        } else {
            for (int j = 0; j < tab.length; j++) {
                tab[j] = j;
            }
        }
        System.out.println(Arrays.toString(tab));
    }

    // C
    public static void doubleValues(int i, int[] tab) {
        if (i <= 0) {
            System.out.println("Podana liczba nie jest dodatnia");
        } else {
            for (int j = 0; j < tab.length; j++) {
                tab[j] = 2 * tab[j];
            }
        }
        System.out.println(Arrays.toString(tab));
    }

    // D
    public static void bezwzgl(int i, int[] tab) {
        if (i <= 0) {
            System.out.println("Podana liczba nie jest dodatnia");
        } else {
            for (int j = 0; j < tab.length; j++) {
                if (tab[j] < 0) {
                    tab[j] = tab[j] * (-1);
                }
            }
        }
        System.out.println(Arrays.toString(tab));
    }
}
