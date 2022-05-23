package cwiczeniaJKrzanowski.rozdzial4;

import java.util.Arrays;

public class zad4_2_12 {

    public static void main(String[] args) {

        reverse(1, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        moveOneLeft(1, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        moveOneRight(1, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        sortArray(1, new int[]{8, 3, 9, 1, 6, 2, 0, 4, 7, 2, 5, 7});

    }

    // A
    public static void reverse(int j, int[] tab) {
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

    // B
    public static void moveOneLeft(int j, int[] tab) {
        int[] result = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            if (i == 0) {
                result[result.length - 1] = tab[0];
            } else {
                result[i - 1] = tab[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }

    // C
    public static void moveOneRight(int j, int[] tab) {
        // {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
        int[] result = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            if (i == tab.length - 1) {
                result[0] = tab[result.length - 1];
            } else {
                result[i + 1] = tab[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }

    // D
    public static void sortArray(int j, int[] tab) {
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));
    }


}
