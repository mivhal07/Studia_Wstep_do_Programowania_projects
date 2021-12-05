package wykład04_12_2021;

public class tenth01 {
    public final static int miesiące = 12;
    public final static int lata = 5;

    public static void main(String[] args) {
        final double[][] deszcz = {
                {10.2, 8.1, 6.8, 4.2, 2.1, 1.8, 0.2, 0.33, 1.1, 2.3, 6.1, 7.4},
                {9.2, 9.8, 4.4, 3.3, 2.2, 0.8, 0.4, 0.0, 0.6, 1.7, 4.3, 5.2},
                {6.6, 5.5, 3.8, 2.8, 1.6, 0.2, 0.0, 0.0, 0.0, 1.3, 2.6, 4.2},
                {4.3, 4.3, 4.3, 3.0, 2.0, 1.0, 0.2, 0.2, 0.4, 2.4, 3.5, 6.6},
                {8.5, 8.2, 1.2, 1.6, 2.4, 0.0, 5.2, 0.9, 0.3, 0.9, 1.4, 7.2}};

        int m;
        double podsuma = 0;
        System.out.println("ROK | OPADY (w cm)");
        double suma = 0;
        for (int r = 0; r < lata; r++) {
            for (m = 0; m < miesiące; m++) {
                podsuma += deszcz[r][m];
            }
            System.out.println(String.format("%s %s", 1995 + r, podsuma));
            suma = suma + podsuma;
            podsuma = 0;
        }
        System.out.println("");
        System.out.println(String.format("Roczna średnia wynosi: %s cm.", suma / lata));
        System.out.println("");
        System.out.println(String.format("ŚREDNIE MIESIĘCZNE:\n"));
        System.out.println(String.format("Sty Lut Mar Kwi Maj Cze Lip Sie Wrz Paź Lis Gru"));

        for (m = 0; m < miesiące; m++) {
            for (int r = 0; r < lata; r++)
                podsuma += deszcz[r][m];
            java.text.DecimalFormat df = new java.text.DecimalFormat("0.0");
            System.out.print(df.format(podsuma / lata));
            System.out.print(" ");
            podsuma = 0;
        }
    }
}
