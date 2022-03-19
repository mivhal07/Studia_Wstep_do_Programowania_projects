package wyklad05_03_2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class eleventh11 {

    public static void main(String[] args) {

        File file = new File("testfile.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                int i = sc.nextInt();
                System.out.println(i);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
