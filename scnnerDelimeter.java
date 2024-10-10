import java.util.Scanner;

public class scnnerDelimeter {
    public static void main(String [] args){

        String input = "1 fish 2 fish blue fish red fish 3";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.next());
        // Notice that 3 does not execute because only 4 prints were made.
        s.close();
    }
}
