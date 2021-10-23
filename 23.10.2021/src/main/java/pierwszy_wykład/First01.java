package pierwszy_wykład;

import java.util.Scanner;

public class First01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj cm, aby odliczyć cale");
        double cm = scanner.nextDouble();
        double cal = 2.54 * cm;
        System.out.println("Po przeliczeniu wynik to: " + cal);
    }
}
