package Kolos.kolokwium26_03_2022;

import java.util.Scanner;

public class Zadanie_3_tablica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println(String.format("Wprowadź %s z 10 liczb do tablicy", i + 1));
            array[i] = scanner.nextInt();
        }
        indexOfSmallest(array);
        scanner.close();
    }

    public static void indexOfSmallest(int[] array) {

        int index = 0;
        int min = array[index];

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
                index = i;
            }
        }
        System.out.println("Najmniejsza liczba to: " + min);
        System.out.println("Jej index to: " + index);
    }
}
