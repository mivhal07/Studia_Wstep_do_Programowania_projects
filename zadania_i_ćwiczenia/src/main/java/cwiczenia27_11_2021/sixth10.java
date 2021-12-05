package cwiczenia27_11_2021;

import java.util.Scanner;

public class sixth10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile będzie liczb w ciągu z dodawaniem");
        int x = scanner.nextInt();
        double sum = 1.0;
        for (int i = 1; i < x; i++) {
            sum += 1.0 / i;
        }

        System.out.println("Suma w podanego ciągu to: " + sum);


        // drugi ciąg

        System.out.println("Podaj ile będzie liczb w ciągu z przemiennym dodawaniem i odejmowaniem");
        int x2 = scanner.nextInt();
        double sum2 = 1.0;
        for (int i = 1; i < x2; i++) {
            if (i % 2 == 0) {
                sum -= 1.0 / i;
            } else {
                sum += 1.0 / i;
            }
        }
        System.out.println("Suma w podanego ciągu to: " + sum);
    }
}
