import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class getminsum {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        Integer[] myArray = {1,3,6,7,10,12};

        List<Integer> list = Arrays.asList(myArray);
        Collections.reverse(list);

        int count = 0;
        System.out.println("Enter the target: ");
        int target = scanner.nextInt();
        for (int i = 0; i < myArray.length - 1; i++){ // i is 0 to 6
            if (Math.abs(myArray[i] - myArray[i + 1]) == target){
                count++;
            }
        }
        System.out.println("The output is: " + count);
        scanner.close();
    }
}
