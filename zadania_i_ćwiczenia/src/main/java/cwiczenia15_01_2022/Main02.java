package cwiczenia15_01_2022;

import java.util.Scanner;

public class Main02 {
    private static int tmp;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 1; i <= array.length; i++) {
            System.out.println(String.format("Wprowadź %s z 10 liczb całkowitych do tablicy", i));
            int i1 = scanner.nextInt();
            array[i - 1] = i1;
        }
        scanner.close();

        double suma = 0;
        double avg = 0;
        int countUjemne = 0;
        int countParzyste = 0;

        System.out.println("");
        System.out.println("***** Pętla FOR *****");
        zFor(array);
        System.out.println("");
        System.out.println("***** Pętla WHILE *****");
        zWhile(array);

        for (int i : array) {
            suma += i;
            if (i % 2 == 0) {
                countParzyste++;
            }
            if (i < 0) {
                countUjemne++;
            }
        }

        avg = suma / array.length;
        System.out.println("");
        System.out.println("");
        System.out.println("Wyniki:");
        System.out.println("Suma liczb w tablicy wynosi: " + suma);
        System.out.println("Średnia liczb w tablicy wynosi: " + avg);
        System.out.println("Ilość liczb ujemnych to: " + countUjemne);
        System.out.println("Ilość liczb parzystych to: " + countParzyste);


    }

    public static void zFor(int[] array) {

        System.out.print("Przed odwróceniem: ");

        for (int i : array) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }

        System.out.print("\nPo odwróceniu:     ");

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void zWhile(int[] array) {

        System.out.print("Przed odwróceniem: ");

// iteracja działa tylko z for, mógłbym to robić ręcznie, ale wydaje mi się to bez sensu skoro mogę użyć ładnej funkcji
        for (int i : array) {
            System.out.print(i + " ");
        }

        int k = 0;
        while (k < array.length / 2) {
            tmp = array[k];
            array[k] = array[array.length - 1 - k];
            array[array.length - 1 - k] = tmp;
            k++;
        }

        System.out.print("\nPo odwróceniu:     ");

// tak samo tutaj
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
