package cwiczenia04_12_2021;

public class tenth04 {

    public static void main(String[] args) {

        int[] tab = {7, 5, 3, 78, 9, 3, 5};

        System.out.println(maxIndex(tab));

    }


    public static int maxIndex(int[] tab) {
        int max = 0;
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > tab[max])
                max = i;
        }
        return max;
    }
}

