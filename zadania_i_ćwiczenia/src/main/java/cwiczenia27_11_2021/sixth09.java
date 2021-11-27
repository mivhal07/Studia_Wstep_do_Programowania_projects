package cwiczenia27_11_2021;

import java.util.Scanner;

public class sixth09 {

    public static void main(String[] args) {

        int[] array = new int[8];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 8 liczb całkowitych, które mają znaleźć się w tablicy");
        array[0] = scanner.nextInt();
        array[1] = scanner.nextInt();
        array[2] = scanner.nextInt();
        array[3] = scanner.nextInt();
        array[4] = scanner.nextInt();
        array[5] = scanner.nextInt();
        array[6] = scanner.nextInt();
        array[7] = scanner.nextInt();

        int rozmiarTab = array.length;
        for (int i = 0; i < rozmiarTab / 2; i++) {
            int temp = array[i];
            array[i] = array[rozmiarTab - 1 - i];
            array[rozmiarTab - 1 - i] = temp;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
