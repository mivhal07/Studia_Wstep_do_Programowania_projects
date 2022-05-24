package cwiczeniaJKrzanowski.rozdzial5;

import java.util.ArrayList;
import java.util.List;

public class zad5_2_11 {

    public static void main(String[] args) {
        wytnijzn("Ala ma kota", "ma");
    }

    public static void wytnijzn(String str1, String str2) {
        List<String> split = new ArrayList<>();
        for (char c : str2.toCharArray()) {
            for (char c1 : str1.toCharArray()) {
                if (c1 == c) {
                    String[] split1 = str1.split(String.valueOf(c));
                    for (String s : split1) {
                        split.add(s);
                    }

                }
            }
        }
        System.out.println(split);

    }
}
