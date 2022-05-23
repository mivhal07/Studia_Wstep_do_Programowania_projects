package cwiczeniaJKrzanowski.rozdzial5;

public class zad5_2_3 {

    public static void main(String[] args) {
        if (porownaj("String1", "String2") == 1) {
            System.out.println("Napisy są równe");
        } else {
            System.out.println("Napisy nie są równe");
        }
    }

    public static int porownaj(String str1, String str2) {
        if (str1.length() == str2.length()) {
            return 1;
        } else {
            return 0;
        }
    }
}
