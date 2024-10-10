import java.util.Scanner;

public class to_24_hour_clock{

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter hours: ");
        int hours = scanner.nextInt();
        float output = hours % 24;
        System.out.println("Hours away from 24 hour format: " + output);
    }
}