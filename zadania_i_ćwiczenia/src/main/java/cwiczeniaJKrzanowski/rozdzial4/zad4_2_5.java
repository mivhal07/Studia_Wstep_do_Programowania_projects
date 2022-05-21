package cwiczeniaJKrzanowski.rozdzial4;

import java.util.Arrays;

public class zad4_2_5 {

    public static void main(String[] args) {

        nameOfFunction(8);

    }

    public static void nameOfFunction(int j) {
        if (j < 3) {
            System.out.println("Podana liczba jest za mała");
        } else {
            int n = 100;
            boolean pierwsze[] = new boolean[n];
            Arrays.fill(pierwsze, true);
            pierwsze[0] = false;
            pierwsze[1] = false;
            for (int i = j; i <= Math.sqrt(n); i++) {
                for (int t = i + i; t < n; t = t + i) {
                    pierwsze[t] = false;
                }
            }

            for (int r = 0; r < n; r++) {
                if (pierwsze[r])
                    System.out.println(r);
            }
        }
    }
}
