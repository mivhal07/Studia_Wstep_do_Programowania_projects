package cwiczeniaJKrzanowski.rozdzial5;

public class zad5_2_10 {

    public static void main(String[] args) {
        wytnij2("Ala ma kota", "ma");
    }

    public static void wytnij2(String str1, String str2) {
        String substring = "";
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            for (int j = 0; j < chars2.length; j++) {
                if (chars1[i] == chars2[j]) {
                    substring = str1.substring(i, i + str2.length());
                    break;
                }
            }
        }
        System.out.println(substring);
    }
}
