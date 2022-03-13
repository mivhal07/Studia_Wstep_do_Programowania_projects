package wyklad05_03_2022;

public class eleventh04 {

    public static void main(String[] args) {

        returnChar("sthfngbgterhyd", 'a');
    }

    public static void returnChar(String text, char b) {

        for (int i = 0; i < text.toCharArray().length; i++) {
            if (text.toCharArray()[i] == b) {
                System.out.println(i + 1);
            }
        }

    }

    public static int returnZero(String string, char b) {
        if (!string.equals(b))
            return 0;
    }
}
