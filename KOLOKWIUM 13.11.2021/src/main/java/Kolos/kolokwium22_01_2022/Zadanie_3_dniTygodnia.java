package Kolos.kolokwium22_01_2022;

import java.util.Scanner;

public class Zadanie_3_dniTygodnia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę od 1 do 7 :)");
        int i = scanner.nextInt();
        System.out.print("Odpowiadający dzień tygodnia to: ");
        if (i==1){
            System.out.println("Niedziela");
        }else if (i==2){
            System.out.println("Poniedziałek");
        }else if (i==3){
            System.out.println("Wtorek");
        }else if (i==4){
            System.out.println("Środa");
        }else if (i==5){
            System.out.println("Czwartek");
        }else if (i==6){
            System.out.println("Piątek");
        }else if (i==7){
            System.out.println("Sobota");
        }else {
            System.out.println("Nie ma takiego dnia");
        }

    }
}
