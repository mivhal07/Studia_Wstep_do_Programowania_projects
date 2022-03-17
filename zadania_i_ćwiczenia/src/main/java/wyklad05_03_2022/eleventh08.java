package wyklad05_03_2022;

public class eleventh08 {

    public static void main(String[] args) {
        System.out.println(reverse("abcdefghijkl"));
    }

    public static String reverse(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }
}
