package cwiczenia27_11_2021;

public class sixth13 {

    public static void main(String[] args) {

        double i = 100;
        double ewa = i;
        double kasia = i;
        int rok;

        for (rok = 1; ; rok++) {
            ewa = ewa + 0.1 * i;
            kasia = kasia + 0.05 * kasia;


            if (kasia > ewa) break;
        }

        System.out.println(String.format("Po: %s latach." +
                " Stan konta Kasi: %s i Ewy: %s",rok,ewa,kasia));
    }
}
