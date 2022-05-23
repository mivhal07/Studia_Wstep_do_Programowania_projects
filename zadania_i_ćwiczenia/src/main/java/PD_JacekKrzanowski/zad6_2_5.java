package PD_JacekKrzanowski;

import java.util.Arrays;
import java.util.Random;

public class zad6_2_5 {

    public static void main(String[] args) {

        nameOfFunction(3, 4, 5);

    }

    // 6.2.1
    public static void nameOfFunction(int n, int m, int k) {
        int[][][] tab = new int[n][m][k];
        // nie mam w Javie wskażników, więc nie bardzo wiem co mam w zamian zwrócić
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                for (int l = 0; l < tab[i][j].length; l++) {
                    tab[i][j][l] = random.nextInt();
                }

            }
        }
        System.out.println(Arrays.toString(tab));
    }

    // 6.2.3
    public static void nameOfFunction2(int n, int m, int k){
        int[][][] tab = new int[n][m][k];
        /* tutaj to samo :/*/
    }
}
