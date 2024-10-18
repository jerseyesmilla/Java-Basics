import java.util.Scanner;


public class boardContainsWord {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scanner.next().toUpperCase();
        
        String[][] board = {{"G","O","O","D"},{"M","A","S","S"}};
            scanner.close();

            for (int i = 0; i < board.length; i++){
                StringBuilder output = new StringBuilder();
                for (String letter : board[i]){
                    output.append(letter);
                }
                if (output.toString().contains(word)){
                    System.out.println("Word found in ROW: " + (i + 1));
                    return;
                }
            }

            for (int j = 0; j < board[0].length; j++){
                StringBuilder newOutput = new StringBuilder();
                for (int k = 0; k < board.length; k++){
                    newOutput.append(board[k][j]);
                }
                if (newOutput.toString().contains(word)){
                    System.out.println("Word found in COLUMN: " + (j+1));
                    return;

                }
            }

            System.out.println("Word not to be found!");


    }
}