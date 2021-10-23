package pierwszy_wykład;

public class Second06 {

    public static void main(String[] args) {
        for (int i = 4; i > 0; i--) {
            System.out.print(show());
            if (i == 3) {
                System.out.print(show() + "\n");
            } else if (i == 2) {
                System.out.print(show() + "\n");
            }
        }
    }

    public static String show() {
        String smile = "Uśmiech!";
        return smile;
    }
}
