public class carClass {
    int modelYear;
    String modelName;
    public void fullThrottle(){
        System.out.println("The car is at full speed!");
    }
    public void speed(int maxSpeed){
        System.out.println("The car is speeding: " + maxSpeed);
    }
    public carClass(int year, String name){
        modelName = name;
        modelYear = year;
    }
    public static void main(String[]args){
        carClass myCar = new carClass(1969,"BMW");
        myCar.fullThrottle();
        myCar.speed(200);
        System.out.println(myCar.modelYear + " " + myCar.modelName);
        


    }
}
