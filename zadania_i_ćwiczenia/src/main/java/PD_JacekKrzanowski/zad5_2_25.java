package PD_JacekKrzanowski;

public class zad5_2_25 {

    public static void main(String[] args) {
        System.out.println(kopiuj("Ala ma kota", 4));
    }

    public static char kopiuj(String str, int n) {
        char[] chars = str.toCharArray();
        return chars[n];
    }
}
