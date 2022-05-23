package cwiczeniaJKrzanowski.rozdzial5;

import java.util.Arrays;

public class zad5_2_5 {

    public static void main(String[] args) {

        przepisz(new String[]{"Tablica", "ze", "Stringiem", "nr 1"}, new String[]{"Tablica", "ze", "Stringiem", "nr 2"});

    }

    public static void przepisz(String[] tab1, String[] tab2) {
        String[] strings = Arrays.copyOf(tab2, tab2.length);
        tab2 = tab1;
        tab1 = strings;
        System.out.println(Arrays.toString(tab1));
        System.out.println(Arrays.toString(tab2));
    }
}
