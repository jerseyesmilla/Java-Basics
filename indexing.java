import java.util.Scanner;

public class indexing {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter DNA 1: ");
        String dna1 = scanner.next();
        System.out.println("Enter DNA 2: ");
        String dna2 = scanner.next();
        System.out.println("Enter index: ");
        int index = scanner.nextInt();
        
        System.out.println(dna1.substring(0, index) + dna2 + dna1.substring(index));
    }
    
}
