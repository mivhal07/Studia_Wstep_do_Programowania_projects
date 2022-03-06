package wyklad05_03_2022;

public class ninth03 {

    public static void main(String[] args) {

        showMe('z',4,7);
    }

    public static void showMe(char a, int b, int c) {

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(a + " ");
            }
            System.out.println("");
        }
    }
}
