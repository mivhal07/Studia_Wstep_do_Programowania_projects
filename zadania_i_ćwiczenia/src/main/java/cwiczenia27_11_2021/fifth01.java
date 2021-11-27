package cwiczenia27_11_2021;

public class fifth01 {
    static final int stałaSymbolcizna = 60;

    public static void main(String[] args) {

        int x = 0;
        int podanyCzas = 12531;
        int resztaMinut = 0;
        int liczbaGodzin = 0;
        while (x < podanyCzas) {
            liczbaGodzin++;
            x = x + 60;
        }
        resztaMinut = podanyCzas % stałaSymbolcizna;

        System.out.println(String.format("Podana ilość minut to: %s," +
                " ilość godzin w tej liczbie to: %s," +
                " a reszta minut z liczby to: %s",podanyCzas,liczbaGodzin,resztaMinut));
    }
}
