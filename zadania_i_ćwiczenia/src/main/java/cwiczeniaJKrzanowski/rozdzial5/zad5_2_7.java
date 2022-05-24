package cwiczeniaJKrzanowski.rozdzial5;

public class zad5_2_7 {

    public static void main(String[] args) {

        sklej(new char[]{'A', 'l', 'a', ' ', 'm'}, new char[]{'a', ' ', 'k', 'o', 't', 'a'}, new char[11]);

    }

    public static void sklej(char[] tab1, char[] tab2, char[] tab3) {
        for (int i = 0; i < tab3.length; i++) {
            if (i < tab3.length / 2) {
                tab3[i] = tab1[i];
            } else {
                tab3[i] = tab2[i - tab3.length / 2];
            }
        }
        for (char c : tab3) {
            System.out.print(c);
        }

    }
}
