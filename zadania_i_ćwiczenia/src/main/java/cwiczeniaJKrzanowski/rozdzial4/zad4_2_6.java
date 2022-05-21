package cwiczeniaJKrzanowski.rozdzial4;

import java.util.Arrays;
import java.util.Collections;

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
    public static void copyReverseArray(int i, int[] tab, int[] tab2) {
        if (i <= 0) {
            System.out.println("Liczba nie jest dodatnia");
        } else {

            Collections.reverse(Arrays.asList(tab));
            System.out.println(tab.toString());
        }
    }
}
