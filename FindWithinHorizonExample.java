import java.util.Scanner;

public class FindWithinHorizonExample {
    public static void main(String[]args){
        String input = "I love programming in Java. Java is awesome!";
        Scanner inputScanner = new Scanner(input);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word you want to find: ");
        String word = scanner.next();
        String found = inputScanner.findWithinHorizon(word, input.length()); //horizon is the number of substring

        if (found != null){
            System.out.println("Found: " + found);
        }
        else{
            System.out.println("Word not found!");
        }
        inputScanner.close();
        scanner.close();

    }
}
