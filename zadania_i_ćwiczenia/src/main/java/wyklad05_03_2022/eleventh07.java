package wyklad05_03_2022;

public class eleventh07 {

    public static void main(String[] args) {
        String str1 = "pula";
        String str2 = "pul";
        zawiera_lan(str1, str2);


    }

    public static void zawiera_lan(String str1, String str2) {
        char[] chars = str1.toCharArray();
        char[] chars1 = str2.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i]==chars1[i]){

            }
        }

    }
}
