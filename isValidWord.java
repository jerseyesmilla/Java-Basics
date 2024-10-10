import java.util.Scanner;

public class isValidWord{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] wordlist = {"JERSEY", "LUCAS", "ONIN"};
        boolean found = false;
        System.out.println("Enter the word: ");
        String word = scanner.next().toUpperCase();

        for (String i : wordlist){
            if (i.equals(word)){
                found = true;
                break;
            }
        }
        System.out.println("Is the word in wordlist? " + found);
    }
}

