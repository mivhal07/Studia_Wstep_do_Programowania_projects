package cwiczeniaJKrzanowski.rozdzial4;

import java.util.Arrays;
import java.util.Random;

public class zad4_2_9 {

    public static void main(String[] args) {

        choseValues(6, new int[]{0, 1, 12, 3, 4, 115}, new int[]{6, 7, 8, 9, 10, 11}, new int[]{22, 33, 44, 55, -66, 77});

    }

    public static void choseValues(int n, int[] tab1, int[] tab2, int[] tab3) {
        int max = 0;
        int secondMax = 0;
        int min = 0;
        int maxTab1 = maxValue(0, tab1);
        int maxTab2 = maxValue(0, tab2);
        int maxTab3 = maxValue(0, tab3);
        if (maxTab1 > maxTab2 && maxTab1 > maxTab3) {
            max = maxTab1;
            if (maxTab2 > maxTab3) {
                secondMax = maxTab2;
            } else {
                secondMax = maxTab3;
            }
        } else if (maxTab2 > maxTab1 && maxTab2 > maxTab3) {
            max = maxTab2;
            if (maxTab1 > maxTab3) {
                secondMax = maxTab1;
            } else {
                secondMax = maxTab3;
            }
        } else {
            max = maxTab3;
        }
        int minTab1 = minValue(tab1);
        int minTab2 = minValue(tab2);
        int minTab3 = minValue(tab3);
        if (minTab1 < maxTab2 && minTab1 < minTab3) {
            min = minTab1;
        } else if (minTab2 < minTab1 && minTab2 < minTab3) {
            min = minTab2;
        } else {
            min = minTab3;
        }
        giveMeTabOf0(tab1);
        giveMeTabOf0(tab2);
        giveMeTabOf0(tab3);
        Random random = new Random();
        tab1[random.nextInt(tab1.length)] = max;
        tab2[random.nextInt(tab2.length)] = secondMax;
        tab3[random.nextInt(tab3.length)] = min;
        System.out.println(Arrays.toString(tab1));
        System.out.println(Arrays.toString(tab2));
        System.out.println(Arrays.toString(tab3));

    }


    public static int maxValue(int a, int[] tab) {
        int max = tab[0];
        for (int j : tab) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static int[] giveMeTabOf0(int[] tab) {
        for (int j = 0; j < tab.length; j++) {
            tab[j] = 0;
        }
        return tab;
    }

    public static int minValue(int[] tab) {
        int min = tab[0];
        for (int i = tab.length - 1; i >= 0; i--) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        return min;
    }
}
