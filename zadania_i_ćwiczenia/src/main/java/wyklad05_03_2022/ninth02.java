package wyklad05_03_2022;

public class ninth02 {

    public static void main(String[] args) {

        rzad_zn('k',12,8);
    }

    public static void rzad_zn(char ch, int i, int j) {
        int result = i - j;
        for (int k = 0; k < result; k++) {
            System.out.print(ch + " ");
        }
    }
}
