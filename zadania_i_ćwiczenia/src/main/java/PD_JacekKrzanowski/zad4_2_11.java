package PD_JacekKrzanowski;

public class zad4_2_11 {

    public static void main(String[] args) {
        double[] tab1 = {0, 1, 2};
        double[] tab2 = {3, 4, 5};
        System.out.println(liczIloczSkalar(1, tab1, tab2));
    }

    public static double liczIloczSkalar(int n, double[] tab1, double[] tab2) {
        double result = tab1[0] * tab2[0] + tab1[1] * tab2[1] + tab1[2] * tab2[2];
        return result;
    }
}
