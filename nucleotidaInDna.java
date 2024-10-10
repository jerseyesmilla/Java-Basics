import java.util.Scanner;

public class nucleotidaInDna{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        boolean output = true;
        int count = 0;
        

        System.out.println("Enter DNA: ");
        String dna = scanner.next();
        System.out.println("Enter nucleotide: ");
        char nuc = scanner.next().charAt(0);

        for (int i = 0; i < dna.length(); i++){
            if (dna.charAt(i) == nuc){
                count ++;
            }
        }
        if (count == 0){
            output = false;
            System.out.println("number of occurrences: " + count);
        }
        System.out.println("number of occurrences: " + count);
        System.out.println("Does the DNA contains nucleotide? " + output);
    }
}