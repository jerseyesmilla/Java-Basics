import java.util.Scanner;
public class toHoursOffSet {

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter utc offset: ");
        float utc = scanner.nextFloat();
        System.out.println("enter time: ");
        float time = scanner.nextFloat();

        float output = (utc - time) % 24;

        System.out.println(output);
    } 
    
}
