package cwiczeniaJKrzanowski.rozdzial5;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class zad5_2_4 {

    public static void main(String[] args) {

        System.out.println(nameOfFunction("krowa", "żyrafa"));

    }

    public static List<String> nameOfFunction(String str1, String str2) {
        List<String> list = new ArrayList<>();
        list.add(str1);
        list.add(str2);
        Collections.sort(list, Collator.getInstance(new Locale("PL")));
        return list;
    }
}
