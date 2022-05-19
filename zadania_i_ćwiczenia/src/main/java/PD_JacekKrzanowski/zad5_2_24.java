package PD_JacekKrzanowski;

public class zad5_2_24 {

    public static void main(String[] args) {
        System.out.println(kopiuj("Ala ma kota", new char[]{'a', 'b', 'c'}));
    }

    public static char[] kopiuj(String str1, char[] chars) {
        chars = str1.toCharArray();
        return chars;
    }
}
