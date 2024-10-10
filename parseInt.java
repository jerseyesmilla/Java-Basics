import java.util.Scanner;

public class parseInt {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: " );
        String num = scanner.nextLine();
        System.out.println(Integer.parseInt(num)+2);
        
    }
}
