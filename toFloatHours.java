import java.util.Scanner;

public class toFloatHours{

    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the hours: ");
        float hours = scanner.nextFloat();
        System.out.println("Enter the minutes: ");
        float minutes = scanner.nextFloat();
        System.out.println("enter the seconds: ");
        float seconds = scanner.nextFloat();

        float output = hours + (minutes / 60) + (seconds / 3600);

        System.out.println("The output is: " + output);
    }
}