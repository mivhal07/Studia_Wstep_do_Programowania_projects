package cwiczenia27_11_2021;

public class fifth05 {

    public static void main(String[] args) {

        int licznik = 0;
        int suma = 0;
        while (licznik++ < 5) {
            suma += licznik * licznik;
        }
        System.out.println(String.format("suma kwadratów = %s", suma));
    }
}
