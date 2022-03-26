package Kolos.kolokwium26_03_2022;

import java.util.Scanner;

public class Zadanie_4_array2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int[] array = {3, -3, -8, 9, 0, -1, 5, 7, 3, -100, -6, 2, 62, 256};
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(String.format("Wprowadź %s z 10 liczb do tablicy", i + 1));
//            array[i] = scanner.nextInt();
//        }
        for (int i : array) {
            if (i < 0) {
                count++;
            }
        }
        int[] array2 = new int[count];
        for (int i = 0; i < array2.length; i++) {
            if (array[i] < 0) {
                for (int j = 0; j < array.length; j++) {
                    array2[j] = array[i];
                }
            }
        }

        indexOfBiggestFromSmallest(array);
        scanner.close();
    }

    public static void indexOfBiggestFromSmallest(int[] array) {

        int index = 0;
        int min = array[index];

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min && array[i] < 0) {
                min = array[i];
                index = i;

            }
        }
        if (index == 0) {
            System.out.println(-111);
        }
        System.out.println("Największa wartość ujemna to: " + min);
        System.out.println("Jej index to: " + index);
    }
}
