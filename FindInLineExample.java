import java.util.Scanner;

public class FindInLineExample {
    public static void main(String[]args){
        String input = "I love programming in Java 1234";
        Scanner inputScanner = new Scanner(input);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the pattern: ");
        String pattern = scanner.next();
        String found = inputScanner.findInLine(pattern);

        if (found != null){
            System.out.println("Found: " + found);
        }
        else{
            System.out.println("Pattern not found!");
        }
        
        scanner.close();
        inputScanner.close();
    }
}
