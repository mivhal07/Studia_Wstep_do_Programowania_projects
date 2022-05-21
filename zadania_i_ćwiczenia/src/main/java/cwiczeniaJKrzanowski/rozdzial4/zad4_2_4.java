package cwiczeniaJKrzanowski.rozdzial4;

public class zad4_2_4 {

    public static void main(String[] args) {

        nameOfFunction(1, new int[]{1, 2, 3, 4, 5, 6, 7});

    }

    public static void nameOfFunction(int i, int[] tab) {
        int sum = 1;
        if (i <= 0) {
            System.out.println("Podana liczba nie jest dodatnia");
        } else {
            for (int j = 0; j < tab.length; j++) {
                sum *= tab[j];
            }
        }
        double result = Math.sqrt(sum);
        System.out.println(result);
    }
}
