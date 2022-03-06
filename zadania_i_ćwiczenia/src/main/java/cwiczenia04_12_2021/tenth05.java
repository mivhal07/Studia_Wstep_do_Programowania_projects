package cwiczenia04_12_2021;

public class tenth05 {

    public static void main(String[] args) {

        int[] tab = {9, 8, 7, 6, 5, 4, 3, 2, 1, 11, 12, 15, 17, 19, 13, 16};

        int min = minValue(tab);
        int max = maxValue(tab);
        int result = max - min;
        System.out.println(result);

    }

    public static int maxValue(int[] tab) {
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max)
                max = tab[i];
        }
        return max;
    }

    public static int minValue(int[] tab) {
        int min = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min)
                min = tab[i];
        }
        return min;
    }
}
