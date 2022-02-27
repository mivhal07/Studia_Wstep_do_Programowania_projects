package cwiczenia27_02_2022;

import java.util.Arrays;

public class Main03 {

    public static void main(String[] args) {

        int[] array = {9, 5, 8, 2, 7, 1, 3, 6, 4};
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int k = array[i];
                    int l = array[j];
                    array[i] = l;
                    array[j] = k;
                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }
}
