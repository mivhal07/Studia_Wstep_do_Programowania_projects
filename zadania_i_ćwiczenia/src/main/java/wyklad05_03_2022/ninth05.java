package wyklad05_03_2022;

import java.util.ArrayList;
import java.util.List;

public class ninth05 {

    public static void main(String[] args) {

        System.out.println(LitToNum("ajhfh"));
    }

    public static List<Integer> LitToNum(String a) {
        List<Integer> nums = new ArrayList<>();
        int index = 0;
        char[] chars = a.toCharArray();
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u',
                'w', 'x', 'y', 'z'};
        char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        for (int i = 0; i < chars.length; i++) {
            for (int k = 0; k < alphabet.length; k++) {
//                for (int j = 0; j < number.length; j++) {
                if (chars[i] == alphabet[k]) {
                    index = k + 1;
                    nums.add(index);
                } /*else if (chars[i] == number[j]) {
                        index = -1;
                        nums.add(index);
                    }*/
            }
        }
        return nums;
    }
}

