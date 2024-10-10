import java.util.Arrays;
import java.util.Scanner;

public class boardContainsWord {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        String[][] board = {{"A","N","T","T"},{"N","O","O","N"}};
        
        System.out.println("Enter a word: ");
        String word = scanner.next().toUpperCase();

        for (int i = 0; i < board.length; i++){ //i is board.length 
            StringBuilder output = new StringBuilder();
            for (String letter : board[i]){ //s is chars in board[i]
                output.append(letter);
                
 
            }
            if (output.toString().contains(word)){
                System.out.println("Word found in row: " + (i + 1));
                return;

            }
        }

        int colIndex = board[0].length; // eto yung 4

        for (int j = 0; j < colIndex; j++){ // meron ka nang 4 for columns
            StringBuilder newOutput = new StringBuilder();
            for (int k = 0; k < board.length; k++){
                newOutput.append(board[k][j]);
            }
            if (String.valueOf(newOutput).contains(word)){
                System.out.println("Word found in column: " + (j + 1));
            }

        }
        scanner.close();
        // board[column][columnIndex]

        

        
    
}
}


