import java.util.Scanner;

public class myScannerDelimeter {
    public static void main(String [] args){
        
        String word = "Jersey,is,learning,to,program,Java!,12312312 3123";
        Scanner scanner = new Scanner(word).useDelimiter(",");
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        scanner.reset();
        System.out.println(scanner.next());
        scanner.close();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word ('exit' to quit): ");

        while(sc.hasNext()){
            String newWord = sc.next();
            if (newWord.equals("exit")){
                break;
            }
            System.out.println("Word is: " + newWord);
        }
        sc.close();
    }
}
