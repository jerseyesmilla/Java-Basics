import java.util.Scanner;


public class longerString {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        String word1 = scanner.next();
        System.out.println("Enter the second word: ");
        String word2 = scanner.next();

        if (word1.length() < word2.length()){
            System.out.println("The longer word is: " + word2);
        }
        else{
            System.out.println("The longer word is: " + word1);
        }
        System.out.print("First word length is: " + word1.length());
        System.out.print(" Second word length is: " + word2.length());
        
    }
}
