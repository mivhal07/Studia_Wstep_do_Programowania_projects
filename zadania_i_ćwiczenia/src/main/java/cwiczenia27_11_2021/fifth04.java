package cwiczenia27_11_2021;

import java.util.Scanner;

public class fifth04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int toCoMieliśmyZmienić = scanner.nextInt();
        int licznik = 0;
        int suma = 0;
        while (licznik++ <= toCoMieliśmyZmienić) {
            suma = suma + licznik;
        }
        System.out.println(String.format("suma = %s", suma));
    }
}
