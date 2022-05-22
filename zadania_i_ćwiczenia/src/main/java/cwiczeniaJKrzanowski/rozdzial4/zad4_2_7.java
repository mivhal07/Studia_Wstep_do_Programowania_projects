package cwiczeniaJKrzanowski.rozdzial4;

import java.util.Arrays;

public class zad4_2_7 {

    public static void main(String[] args) {

        sumArrays(6, new int[]{0, 1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 10, 11}, new int[6]);
        takeTheBiggest(6, new int[]{0, 1, 12, 3, 4, 115}, new int[]{6, 7, 8, 9, 10, 11}, new int[6]);
        threeXCopies(6, new int[]{0, 1, 12, 3, 4, 115}, new int[]{6, 7, 8, 9, 10, 11}, new int[]{22, 33, 44, 55, 66, 77});
    }

    // A
    public static void sumArrays(int n, int[] tab1, int[] tab2, int[] tab3) {
        for (int i = 0; i < tab3.length; i++) {
            tab3[i] = tab2[i] + tab1[i];
        }
        System.out.println(Arrays.toString(tab3));
    }

    // B
    public static void takeTheBiggest(int n, int[] tab1, int[] tab2, int[] tab3) {
        for (int i = 0; i < tab3.length; i++) {
            if (tab1[i] > tab2[i]) {
                tab3[i] = tab1[i];
            } else {
                tab3[i] = tab2[i];
            }
        }
        System.out.println(Arrays.toString(tab3));
    }

    // C
    public static void threeXCopies(int n, int[] tab1, int[] tab2, int[] tab3) {
        int[] ints2 = Arrays.copyOf(tab2, tab3.length);
        int[] ints3 = Arrays.copyOf(tab3, tab3.length);
        tab2 = Arrays.copyOf(tab1, tab1.length);
        tab3 = Arrays.copyOf(ints2, ints3.length);
        tab1 = ints3;
        System.out.println(Arrays.toString(tab1));
        System.out.println(Arrays.toString(tab2));
        System.out.println(Arrays.toString(tab3));
    }
}
