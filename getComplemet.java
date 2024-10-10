import java.util.Scanner;

public class getComplemet{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter DNA: ");
        String dna = scanner.next().toUpperCase();

        StringBuilder complement = new StringBuilder();

        for (int i = 0; i < dna.length(); i++){
            char nuc = dna.charAt(i);
            switch(nuc){
                case 'A':
                complement.append('T');
                break;
                case 'T':
                complement.append('A');
                break;
                case 'G':
                complement.append('C');
                break;
                case 'C':
                complement.append('G');
                break;
                default:
                System.out.println("Invalid nucleotide found: " + nuc);
                complement.append(Character.toLowerCase(nuc));
                
                break;
            }
        }
        System.out.println("Complementary Sequence: " + complement);
    }
}