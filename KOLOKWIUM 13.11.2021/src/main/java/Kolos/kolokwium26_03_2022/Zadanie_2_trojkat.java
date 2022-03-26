package Kolos.kolokwium26_03_2022;

import java.util.Scanner;

public class Zadanie_2_trojkat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wczytaj 3 odcinki a ja spróbuję ułożyć z nich trójkąt");
        System.out.println("Wczytaj odcinek przyprostokątnej");
        double A = scanner.nextDouble();
        System.out.println("Wczytaj odcinek drugiej przyprostokątnej");
        double B = scanner.nextDouble();
        System.out.println("Wczytaj odcinek przeciwprostokątnej");
        double C = scanner.nextDouble();
        if (sprCzyTroj(A, B, C) == 1) {
            System.out.println("Tak, mogę z tych odcinków zbudować trójkąt");
        } else {
            System.out.println("Nie, nie mogę zbudować z tych odcinków trójkąta");
        }
    }

    public static int sprCzyTroj(double A, double B, double C) {
        if (Math.pow(A, 2) + Math.pow(B, 2) == Math.pow(C, 2)) {
            return 1;
        } else {
            return 0;
        }
    }
}
