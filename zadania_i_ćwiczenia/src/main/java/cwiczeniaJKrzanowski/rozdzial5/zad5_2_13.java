package cwiczeniaJKrzanowski.rozdzial5;

public class zad5_2_13 {

    public static void main(String[] args) {
        wytnijtm("Ala ma kota", "Ama");
    }

    public static void wytnijtm(String nap1, String nap2) {
        for (int i = 0; i < nap1.toCharArray().length; i++) {
            for (int j = 0; j < nap2.toCharArray().length; j++) {
                if (nap1.toCharArray()[i] == nap2.toCharArray()[i]) {
                    nap1.replace(nap1.toCharArray()[i], ' ');
                }
            }
        }
        System.out.println(nap1);
    }
}
