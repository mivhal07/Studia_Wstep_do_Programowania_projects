package cwiczenia27_02_2022;

import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        double A = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę");
        double B = scanner.nextDouble();
        if (A > B) {
            System.out.println("Największa z tych liczb to: " + A);
            System.out.println("Najmniejsza z tych liczb to: " + B);
        } else if (B > A) {
            System.out.println("Największa z tych liczb to: " + B);
            System.out.println("Najmniejsza z tych liczb to: " + A);
        } else {
            System.out.println("Liczby są równe :)");
        }
    }
}



/*


 __________
|  Start   |
 ----------
     |
     |
     |
 ____________
|  wyświetl  |
| podaj dane |
 ------------
     |
     |
     |
 _____________       NIE
|  if A>B     | ----------   ___________________
 _____________              |    Wyświetl       |
     |                       -------------------
     |  TAK                          |
     |                               |
     |                               |
 _______________               ____________________
| wyświetl      |-----------  |     KONIEC         |
 _______________               --------------------
 */
