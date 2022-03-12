package wyklad05_03_2022;

public class ninth02 {

    public static void main(String[] args) {

        rzad_zn('k', 4, 8);
    }

    public static void rzad_zn(char ch, int i, int j) {

        for (int k = 0; k < j; k++) {
            System.out.print(k + 1 + " ");
        }
        System.out.println("");
        for (int k = 0; k < j; k++) {
            if (k >= i) {
                System.out.print(ch + " ");
            } else {
                System.out.print("  ");
            }
        }

    }
}
