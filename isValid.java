import java.util.Scanner;

public class isValid {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        boolean output = true;
        String valid = "ABCD";

        System.out.println("Enter a sequence: ");
        String sequence = scanner.next();

        for (int i = 0; i < sequence.length(); i++){
            char currentChar = sequence.charAt(i);
            if (!valid.contains(String.valueOf(currentChar))){
                output = false;
                break;
            }

    }
    System.out.println(output);
    scanner.close();
}
}