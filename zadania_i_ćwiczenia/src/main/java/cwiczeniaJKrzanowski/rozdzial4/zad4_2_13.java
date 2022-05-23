package cwiczeniaJKrzanowski.rozdzial4;

import java.util.Arrays;

public class zad4_2_13 {

    public static void main(String[] args) {

        System.out.println("Wartość pierwszego elementu to: " + nameOfFunction(7, new int[]{110, 1, 2, 3, 4, 5, 6, 7, 8, 9}));

    }

    public static int nameOfFunction(int k, int[] tab) {
        int[] ints1 = Arrays.copyOf(tab, k);
        return ints1[0];
    }
}
