package cwiczenia04_12_2021;

import java.util.Arrays;

public class tenth02 {

    public static void main(String[] args) {

        int[] tab = new int[0];

        int[] tab2 = Arrays.copyOf(tab, tab.length);

        int[] tab3 = new int[tab.length];
        for (int i = tab.length - 1; i >= 0; i--) {
            tab[i] = tab3[i];
        }
    }
}
