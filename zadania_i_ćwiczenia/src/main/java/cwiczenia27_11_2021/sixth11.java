package cwiczenia27_11_2021;

public class sixth11 {

    public static void main(String[] args) {

        double[] tab = new double[8];

        for (double i = 0; i < tab.length; i++) {
            tab[(int) i] = Math.pow(2.0, i + 1.0);
        }
        int i = 0;
        while (i <= tab.length - 1) {
            System.out.println(String.format("%s element tablicyto: %s",
                    i + 1, tab[i]));
            i++;
        }
    }
}
