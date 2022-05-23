package cwiczeniaJKrzanowski.rozdzial5;

import java.util.Arrays;

public class zad5_2_1 {

    public static void main(String[] args) {
        wyczysc(2, new String[]{"To", "jest", "tablica", "Stringa"});
    }

    public static void wyczysc(int n, String[] tab) {
        tab[n] = "";
        System.out.println(Arrays.toString(tab));
    }
}
