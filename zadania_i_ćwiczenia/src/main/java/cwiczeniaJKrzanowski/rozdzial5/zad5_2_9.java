package cwiczeniaJKrzanowski.rozdzial5;

public class zad5_2_9 {

    public static void main(String[] args) {
        wytnij("Ala ma kota", 3, 5);
    }

    public static void wytnij(String str1, int n, int m) {
        char[] chars = str1.toCharArray();
        if (n > m) {
            System.out.println("Nie poprawne dane");
        } else {
            for (int i = 0; i < chars.length; i++) {
                if (i >= n && i <= m) {

                } else {
                    System.out.print(chars[i]);
                }
            }
        }
    }
}
