package wyklad05_03_2022;

public class ninth04 {

    public static void main(String[] args) {

        System.out.println(avgHarmonic(5,8));
    }

    public static double avgHarmonic(double a, double b) {

        double odwA = 1 / a;
        double odwB = 1 / b;
        double avg = (odwA + odwB) / 2;
        double odwAvg = 1 / avg;

        return odwAvg;
    }
}
