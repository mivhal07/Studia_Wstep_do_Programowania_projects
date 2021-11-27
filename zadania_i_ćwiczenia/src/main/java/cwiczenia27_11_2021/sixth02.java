package cwiczenia27_11_2021;

public class sixth02 {

    public static void main(String[] args) {

        String symbol = "$";
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(symbol);
            }
            System.out.println("");
        }
    }
}
