package cwiczenia27_11_2021;

import java.util.Scanner;

public class fifth03 {

    public static void main(String[] args) {

        int dniWTyg = 7;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę dni, a ja zamienię to na tygodnie");
        int liczbaDni = scanner.nextInt();
        int liczbaTygodni = 0;
        int resztaDni = 0;
        for (int i = 0; i <= liczbaDni; i++) {
            if (i % 7 == 0) {
                liczbaTygodni++;
            }
        }
        liczbaTygodni = liczbaTygodni - 1;
        resztaDni = liczbaDni - (liczbaTygodni * 7);
        System.out.println(String.format("W podanej liczbie dni jest/są:" +
                " %s tygodni(e) i %s dni.", liczbaTygodni, resztaDni));
    }
}
