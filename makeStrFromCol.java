import java.util.Scanner;

public class makeStrFromCol {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        String[][] board = {{"A", "B", "C"},{"D", "E", "F"}}; 
        StringBuilder output = new StringBuilder();

        System.out.println("Enter the column number: ");
        int colnum = scanner.nextInt();

        if (colnum < 0 || colnum >= board[0].length){
            System.out.println("Invalid column number!");
        }
        for (int i = 0; i < board.length; i++){
            output.append(board[i][colnum]);
        }
        System.out.println("String from column: " + output);
    }
}
