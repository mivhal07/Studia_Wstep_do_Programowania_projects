package wykład04_12_2021;

import java.util.Arrays;

public class tenth08 {

    public static void main(String[] args) {

        int[] tablica1 = {1, 3, 5, 7};
        int[] tablica2 = {2, 3, 4, 5};
        int[] tablica1i2 = new int[tablica1.length];
        for (int i = 0; i < tablica1.length; i++) {
            int i1 = tablica1[i] + tablica2[i];
            tablica1i2[i] = i1;
        }
        System.out.println(Arrays.toString(tablica1i2));
    }

}
