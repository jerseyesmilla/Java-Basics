import java.util.Scanner;
import java.util.regex.Pattern;

public class SkipExample {
    public static void main(String[]args){
        String input = "Jersey 123 Lucas 456 Onin";
        Scanner scanner = new Scanner(input);

        Pattern myPattern = Pattern.compile("\\d+");
        System.out.println("Origial input: " + input);

        while(scanner.hasNext()){
            String token = scanner.next();
            if (myPattern.matcher(token).matches()){
                System.out.println("Skipping: " + token);
                continue;
            }
            System.out.println("Token: " + token);
        }
        scanner.close();
    }
    
}