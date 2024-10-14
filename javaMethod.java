public class javaMethod {
    static String myMethod(String fname, int age){
    return fname + " Esmilla " + age + " years old!";

}
    static int addition(int x, int y){
        return x + y;

    }
    static double Duble(double x, double y){
        return x + y;

    }

public static void main(String [] args){

    int sum = addition(25, 40);
    double dble = Duble(20, 5);
    String details = myMethod("Jersey", 25);
    System.out.println(details);
    System.out.println(sum);
    System.out.println(dble);
}
}