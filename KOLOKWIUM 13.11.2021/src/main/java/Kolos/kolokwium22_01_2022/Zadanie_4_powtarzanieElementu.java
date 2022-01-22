package Kolos.kolokwium22_01_2022;

import java.util.Scanner;

public class Zadanie_4_powtarzanieElementu {

    public static void main(String[] args) {

        int[] array = new int[10];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("Wczytaj %s z 10 elementów tablicy", i +1));
            int i1 = scanner.nextInt();
            array[i]=i1;
        }

        for (int i : array) {
            if (i%2==0){
                System.out.print(i+", ");
            }else {
                System.out.print(i + ", " + i +", ");
            }
        }


    }
}
