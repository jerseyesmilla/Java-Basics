import java.util.Scanner;

public class makeStringFromRow {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        String[][] table = {{"a", "b", "c"}, {"d", "e", "f"}};
        StringBuilder output = new StringBuilder();
        System.out.println("Enter the row index: ");
        int rowIndex = scanner.nextInt();
        
        if (rowIndex >= table.length || rowIndex < 0){
            System.out.println("Index out of bounds");
        }

        for (String i : table[rowIndex]){
            output.append(i);
        }
        System.out.println("String from the row: " + output);
        scanner.close();

    }
}
