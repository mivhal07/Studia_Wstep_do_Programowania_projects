package pierwszy_wykład;

import java.util.Scanner;

public class Third06 {
    public static void main(String[] args) {

        double weightOfOneAWaterMoleculeInGrams = 3.0 * (Math.pow(10, -23));
        double numberOfAWaterMoleculeInOneKgOfWater = 1 / weightOfOneAWaterMoleculeInGrams;

        double x = getWeightOfWaterInLiters();
        System.out.println("Ilość cząsteczek wody w podanej wadze to: " +
                x * numberOfAWaterMoleculeInOneKgOfWater);

    }

    public static double getWeightOfWaterInLiters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wagę wody w litrach.");
        return scanner.nextDouble();
    }
}
