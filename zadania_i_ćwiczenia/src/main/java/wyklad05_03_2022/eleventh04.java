package wyklad05_03_2022;

import java.util.Arrays;

public class eleventh04 {

    public static void main(String[] args) {

        returnChar("sathfngbgaaaaterhyd", 'a');
    }

    public static void returnChar(String text, char b) {

        int[] array = new int[text.length()];
        for (int i = 0; i < text.toCharArray().length; i++) {
            if (text.toCharArray()[i] == b) {
                array[i] = i + 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
