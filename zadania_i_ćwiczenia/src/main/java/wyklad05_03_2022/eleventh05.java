package wyklad05_03_2022;

import java.util.Arrays;

public class eleventh05 {

    public static void main(String[] args) {

        zawiera("sathfngbgaaaaterhyd", 'a');
    }

    public static void zawiera(String text, char b) {

        String[] array = new String[text.length()];
        for (int i = 0; i < text.toCharArray().length; i++) {
            if (text.toCharArray()[i] == b) {
                array[i] = String.valueOf(true);
            } else {
                array[i] = String.valueOf(0);
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
