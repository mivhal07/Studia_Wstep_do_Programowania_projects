package cwiczeniaJKrzanowski.rozdzial5;

import java.util.Arrays;

public class zad5_2_6 {

    public static void main(String[] args) {

        kopiujn(new char[]{'T', 'o', ' ', 'j', 'e', 's', 't', ' ', 'c', 'h', 'a', 'r', '1'}, new char[5], 5);
    }

    public static void kopiujn(char[] nap1, char[] nap2, int n) {
        if (nap1.length > n) {
            for (int i = 0; i < n; i++) {
                nap2[i] = nap1[i];
            }
        } else {
            nap2 = nap1;
        }
        System.out.println(Arrays.toString(nap2));
    }
}
