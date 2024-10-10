import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScExample {
    public static void main(String[] args) {
        try {
            System.out.println("Starting file read...");
            Scanner sc = new Scanner(new File("C:\\Users\\JERSEY\\Myfirst_javaProject\\myNumbers.txt"));
            while (sc.hasNextLong()) {
                long aLong = sc.nextLong();
                System.out.println("Number found: " + aLong);
            }
            sc.close();
            System.out.println("File read completed.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}
