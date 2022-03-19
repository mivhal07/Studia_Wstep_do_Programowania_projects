package wyklad05_03_2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class eleventh11 {

    public static void main(String[] args) {
// Po czasie zrozumiałem polecenie i wystarczy, zamiast wczytywania pliku zrobić za pomocą args, jak w nast. zadaniu.
// Jeżeli będzie trzeba, to zmienię, ale teraz nie chcę, bo mimo wszystko trochę wysiłku w zadanie włożyłem.
        int countOfSpaces = 0;
        int countOfBigChar = 0;
        int countOfSmallChar = 0;
        int countOfNumber = 0;
        int countOfSymbols = 0;
        File file = new File("testfile.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                for (char c : s.toCharArray()) {
                    if (Character.isUpperCase(c)) {
                        countOfBigChar++;
                    } else if (Character.isLowerCase(c)) {
                        countOfSmallChar++;
                    } else if (Character.isWhitespace(c)) {
                        countOfSpaces++;
                    } else if (Character.isDigit(c)) {
                        countOfNumber++;
                    } else if (!Character.isLetter(c)) {
                        countOfSymbols++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("countOfBigChar       " + countOfBigChar);
        System.out.println("countOfSmallChar     " + countOfSmallChar);
        System.out.println("countOfNumber        " + countOfNumber);
        System.out.println("countOfSymbols       " + countOfSymbols);
        System.out.println("countOfSpaces        " + countOfSpaces);
    }
}
