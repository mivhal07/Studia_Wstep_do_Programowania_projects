package wyklad05_03_2022;

public class ninth01 {

    public static void main(String[] args) {
        double a = 13.56;
        double b = 56.101;
        System.out.println(min(a, b));

    }

    public static double min(double x, double y) {
        if (x < y) {
            return x;
        } else return y;
    }
}
