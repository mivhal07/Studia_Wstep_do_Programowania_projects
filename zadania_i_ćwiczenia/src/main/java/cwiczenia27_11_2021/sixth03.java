package cwiczenia27_11_2021;

public class sixth03 {

    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < i; j++) {
                int symbol = 70 - j;
                System.out.print((char) symbol);
            }
            System.out.println("");
        }
    }
}
