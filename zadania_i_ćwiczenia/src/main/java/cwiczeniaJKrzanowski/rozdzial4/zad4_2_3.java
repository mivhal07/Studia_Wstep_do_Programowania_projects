package cwiczeniaJKrzanowski.rozdzial4;

public class zad4_2_3 {

    public static void main(String[] args) {

        nameOfFunction(1, new int[]{1, 2, 3, 4, 5, 6, 7});

    }

    public static void nameOfFunction(int i, final int[] tab) {
        int sum = 0;
        if (i <= 0) {
            System.out.println("Podana liczba nie jest dodatnia");
        } else {
            for (int j = 0; j < tab.length; j++) {
                sum += tab[j];
            }
        }
        double result = sum / tab.length;
        System.out.println(result);
    }
}
