package cwiczeniaJKrzanowski.rozdzial4;

import java.util.Arrays;

public class zad4_2_17 {

    public static void main(String[] args) {

        System.out.println("Tablica double: " + nameOfFunction(7, new double[]{0, 1, 2, 3, 4, 5, 6, 77}));

    }

    public static String nameOfFunction(int n, double[] tab) {
        return Arrays.toString(Arrays.copyOf(tab, n));
    }
}
