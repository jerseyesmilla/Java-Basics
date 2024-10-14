public class OOP {
    int x = 5; //you can add final to make it unchangeable
    String fname = "Jersey";
    String lname = "Esmilla";
    int y;

static void myStaticMethod(){
    System.out.println("This is static method and can be called without creating objects!");
}
public void myPublicMethod(){
    System.out.println("Public methods must be called by an object.");
}
public OOP(int s){
    y = s; //I used contructor method to assign a value to y in class OOP

}
public OOP(){
    y = 0; //I used contructor method to assign a value to y in class OOP

}
public static void main(String[]args){
    myStaticMethod();
    OOP myObj = new OOP();
    OOP yValue = new OOP(99); //y object
    myObj.myPublicMethod();
    System.out.println(yValue.y);
}
}
