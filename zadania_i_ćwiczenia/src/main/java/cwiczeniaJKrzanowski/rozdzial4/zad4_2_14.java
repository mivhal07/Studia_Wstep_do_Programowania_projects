package cwiczeniaJKrzanowski.rozdzial4;

import java.util.Arrays;

public class zad4_2_14 {

    public static void main(String[] args) {

        System.out.println("Wartość pierwszego elementu to: " + nameOfFunction(7, new double[]{110, 1, 2, 3, 4, 5, 6, 7, 8, 9}));

    }

    public static double nameOfFunction(int n, double[] tab) {
        double[] ints1 = Arrays.copyOf(tab, n);
        return ints1[0];
    }
}
