import java.util.Scanner;

public class board {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        String[][] myBoard = {{"A","L", "L", "Y"},{"W","O","W","H"}};

        System.out.println("Enter a word: ");
        String word = scanner.next().toUpperCase();

        for (int i = 0; i < myBoard.length; i++){
            StringBuilder output = new StringBuilder();
            for(String letter : myBoard[i]){
                output.append(letter);
            }
            if (output.toString().contains(word)){
                System.out.println("Word found in row: " + (i + 1));
                return;
            }
            
        }
        System.out.println("Word not to be found!");
        scanner.close();

    }
}
