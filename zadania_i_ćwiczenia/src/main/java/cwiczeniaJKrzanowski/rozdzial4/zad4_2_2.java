package cwiczeniaJKrzanowski.rozdzial4;

public class zad4_2_2 {

    public static void main(String[] args) {

        nameOfFunction(1, new int[]{1, 2, 3, 4, 5, 6, 7});
        nameOfFunction2(1, new int[]{1, 2, 3, 4, 5, 6, 7});
        nameOfFunction3(1, new int[]{1, 2, 3, 4, 5, 6, 7});

    }

    //A
    public static void nameOfFunction(int i, int[] tab) {
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

    //B
    public static void nameOfFunction2(int i, int[] tab) {
        int sum = 0;
        if (i <= 0) {
            System.out.println("Podana liczba nie jest dodatnia");
        } else {
            for (int j = 0; j < tab.length; j++) {
                sum += tab[j];
            }
        }
        System.out.println(sum);
    }

    // C
    public static void nameOfFunction3(int i, int[] tab) {
        int sum = 0;
        if (i <= 0) {
            System.out.println("Podana liczba nie jest dodatnia");
        } else {
            for (int j = 0; j < tab.length; j++) {
                sum += tab[j] * tab[j];
            }
        }
        System.out.println(sum);
    }
}
