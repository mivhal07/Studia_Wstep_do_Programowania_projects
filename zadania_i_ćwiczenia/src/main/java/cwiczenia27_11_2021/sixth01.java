package cwiczenia27_11_2021;

public class sixth01 {

    public static void main(String[] args) {

        int[] array = new int[26];
        for (char i = 0; i <= array.length - 1; i++) {
            char character = (char) (i + 97);
            array[i] = character;
        }
        for (int i : array) {
            System.out.print((char) i + " ");
        }

    }
}
