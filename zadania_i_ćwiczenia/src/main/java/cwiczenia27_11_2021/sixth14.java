package cwiczenia27_11_2021;

public class sixth14 {

    public static void main(String[] args) {

        double wygrana = 1000000;
        int rok;

        for (rok = 1; ; rok++) {
            wygrana = wygrana + 0.08 * rok;
            wygrana = wygrana - 100000;
            if (wygrana <= 0) break;
        }

        System.out.println("Jim spłuka się po: " + rok + " latach");
    }
}
