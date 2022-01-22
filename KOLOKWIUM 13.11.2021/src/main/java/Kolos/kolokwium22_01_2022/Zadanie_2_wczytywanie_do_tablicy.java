package Kolos.kolokwium22_01_2022;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie_2_wczytywanie_do_tablicy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arrayA = new int[5];
        int[] arrayB = new int[5];
        for (int i = 1; i <= arrayA.length; i++) {
            System.out.println(String.format("Wprowadź %s z 5 liczb całkowitych do tablicy A", i));
            int i1 = scanner.nextInt();
            arrayA[i - 1] = i1;
        }
        for (int i = 1; i <= arrayB.length; i++) {
            System.out.println(String.format("Wprowadź %s z 5 liczb całkowitych, niezerowych do tablicy B", i));
            int i1 = scanner.nextInt();
            if (i1 == 0) {
                System.out.println("Niezerową wartość!!! Podaj wartość jeszcze raz, byle nie 0, od początku :)");
                i=0;
            } else {
                arrayB[i - 1] = i1;
            }
        }
        scanner.close();

        double[] arrayC = new double[5];
        for (int i = 0; i < arrayC.length; i++) {
            arrayC[i]=arrayA[i]/arrayB[i];
        }

        System.out.println(Arrays.toString(arrayC));

    }
}
