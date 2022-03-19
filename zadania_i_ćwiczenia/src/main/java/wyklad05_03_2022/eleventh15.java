package wyklad05_03_2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class eleventh15 {

    public static void main(String[] args) {

        File file = new File("tekst1.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String s = scanner.nextLine();
                System.out.println(s);
            }
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Wybierz dalsze polecenie");
            int s = scanner1.nextInt();
            if (s==1){
                while (scanner.hasNextLine()){
                    String c = scanner.nextLine();
                    System.out.println(c);
                }
            }else if (s==2){
                while (scanner.hasNextLine()){
                    String c = scanner.nextLine();
                    toUpperCase(c);
                }
            }else if (s==3){
                while (scanner.hasNextLine()){
                    String c = scanner.nextLine();
                    toLowerCase(c);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
