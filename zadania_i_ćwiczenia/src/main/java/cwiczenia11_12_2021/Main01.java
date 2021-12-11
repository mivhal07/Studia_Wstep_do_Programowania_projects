package cwiczenia11_12_2021;

import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {

        //rozwiązać równanie liniowe A*x+B=0
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź parametr 'A', nie może być zerem");
        double A = scanner.nextDouble();
        System.out.println("Wprowadź parametr 'B'");
        double B = scanner.nextDouble();
        if (A == 0) {
            System.out.println("Jak pisałem wcześniej 'A' nie może być zerem");
        } else {
            double x = -B / A;
            System.out.println(String.format("Równanie to: A*x+B=0"));
            System.out.println(String.format("x = %s", x));

            System.out.println("");
            System.out.println("Sprawdzenie:");
            if (x < 0) {
                System.out.println(String.format("A*x+B=0  =>  %s*x+%s=0  =>  %s*(%s)+%s=0", A, B, A, x, B));
            } else {
                System.out.println(String.format("A*x+B=0  =>  %s*x+%s=0  =>  %s*%s+%s=0", A, B, A, x, B));
            }
            System.out.println("Sprawdzenie:");
            System.out.println(String.format("A*x+B=0  =>  %s*x+%s=0  =>  x=-%s/%s  =>  x=%s", A, B, B, A, x));
        }
    }
}

/*
Schemat blokowy:                                                    PRACA DOMOWA
                                                                    Ax^2+B*x+C=0
 ------------------                                                Delta=B^2-4*A*C
|       START      |
 ------------------
        |
        |
        v
 ------------------------
| Wprowadzenie danych A,B|
 ------------------------
        |
        |
        v
 -----------------   TAK    ---------------     TAK    ---------------------------
| jeżeli A = 0    |  --->  |  Czy B jest 0 |  ---->   | Każdy x jest rozwiązaniem |
 -----------------          ---------------            ---------------------------
        |                            |                                 |
        |  NIE                       | NIE                             |
        v                            v                                 v
 -----------------------         -------------                 -----------------
| przekształcenie wzoru |       |   BRAK      |   --------->  |     KONIEC      |
 -----------------------         -------------                 -----------------
        |
        |
        v
 ---------------------------
| Obliczenie i wyświetlenie |
 ---------------------------
         |
         |
         v
 ----------------
|    KONIEC      |
 ----------------
 */
