package wyklad05_03_2022;

public class eleventh03 {

    public static void main(String[] args) {

        readStr1(15, "rfbs yntrtewfsdvfbth");

    }

    public static void readStr1(int n, String tekst) {

        String[] s = tekst.split(" ");
        String s1 = s[0];
        if (s1.length() <= n) {
            System.out.println(s1);
        } else {
            System.out.println(s1.substring(0, n));
            ;
        }

    }
}
