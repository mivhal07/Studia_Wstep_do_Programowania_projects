package wyklad05_03_2022;

import java.util.Arrays;

public class eleventh06 {

    public static void main(String[] args) {
        int n = 8;
        int[] s1 = new int[n];
        int[] s2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 22, 655};
        strcpy(s1, s2, n);


    }

    public static void strcpy(int[] s1, int[] s2, int n) {

        try {
            for (int i = 0; i < n; i++) {
                s1[i] = s2[i];
            }
        } catch (IndexOutOfBoundsException e) {
        }
        System.out.println(Arrays.toString(s1));
    }
}
