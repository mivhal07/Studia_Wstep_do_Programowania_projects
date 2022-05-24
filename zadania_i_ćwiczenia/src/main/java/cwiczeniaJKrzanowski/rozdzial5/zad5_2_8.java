package cwiczeniaJKrzanowski.rozdzial5;

import java.util.Arrays;

public class zad5_2_8 {

    public static void main(String[] args) {
        replace("To jest jakiś String");
    }

    public static void replace(String str1) {
        System.out.println(Arrays.toString(str1.toUpperCase().toCharArray()));
    }
}
