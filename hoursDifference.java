import java.util.Scanner;

public class hoursDifference{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num 1: ");
        float time1 = scanner.nextFloat();
        System.out.println("enter num 2: ");
        float time2 = scanner.nextFloat();

        float output = (time2 - time1) / 3600;

        System.out.println("the output is : " + output);
    }
}
