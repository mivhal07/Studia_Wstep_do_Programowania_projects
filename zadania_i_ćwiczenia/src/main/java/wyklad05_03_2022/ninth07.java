package wyklad05_03_2022;

public class ninth07 {

    public static void main(String[] args) {

        System.out.println(potęga(5, 3));
    }

    public static double potęga(double number, int powNum) {
        if (powNum == 0) {
            return 1.0;
        } else if (number == 0.0) {
            return 0.0;
        } else if (powNum < 0) {
            return 1 / (Math.pow(number, -powNum - 1) * number);
        } else {
            return Math.pow(number, powNum - 1) * number;
        }
    }
}
