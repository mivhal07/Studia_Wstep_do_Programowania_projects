package cwiczeniaJKrzanowski.rozdzial4;

import java.util.Arrays;

public class zad4_2_8 {

    public static void main(String[] args) {

        joinArrays(6, new int[]{0, 1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 10, 11}, new int[6 * 2]);
        joinArrays2(6, new int[]{0, 1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 10, 11}, new int[6 * 2]);

    }

    // A
    public static void joinArrays(int n, int[] tab1, int[] tab2, int[] tab3) {
        for (int i = 0; i < tab1.length; i++) {
            tab3[i] = tab1[i];
        }
        for (int i = 0; i < tab2.length; i++) {
            tab3[i + tab1.length] = tab2[i];
        }
        System.out.println(Arrays.toString(tab3));
    }

    // B
    public static void joinArrays2(int n, int[] tab1, int[] tab2, int[] tab3) {
        int k = 0;
        int j = 0;
        for (int i = 0; i < tab3.length; i++) {
            if (i % 2 == 0) {
                tab3[i] = tab1[j];
                j++;
            } else {
                tab3[i] = tab2[k];
                k++;
            }
        }
        System.out.println(Arrays.toString(tab3));
    }
}
