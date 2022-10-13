

public class Main {
    public static void main(String[] args) {
        System.out.println("Bike");
        Bike bike=new Bike();
        System.out.println("Accelerate");
        System.out.println("Speed"+bike.accelerate(50));
        System.out.println("Deaccelerate");
       System.out.println( "Speed"+bike.deAccelerate(50));
       System.out.println("Fuel capacity:"+bike.fuelCapacity);
       System.out.println("Mileage:"+bike.mileageCalculation(45));
       Car car=new Car();
       System.out.println("Reverse");
       System.out.println("Speed:"+car.reverse());
        System.out.println("Accelerate");
        System.out.println("Speed"+car.accelerate(70));
        System.out.println("Deaccelerate");
        System.out.println( "Speed"+car.deAccelerate(60));
        System.out.println("Fuel capacity:"+car.fuelCapacity);
        System.out.println("Mileage:"+car.mileageCalculation(70));
        Lorry lorry=new Lorry();
        System.out.println("Lorry");
        System.out.println("Speed:"+lorry.reverse());
        System.out.println("Accelerate");
        System.out.println("Speed"+lorry.accelerate(70));
        System.out.println("Deaccelerate");
        System.out.println( "Speed"+lorry.deAccelerate(60));
        System.out.println("Fuel capacity:"+car.fuelCapacity);
        System.out.println("Mileage:"+lorry.mileageCalculation(70));
    }
}
 class Vehicle
 {
     int wheels=4;
     int fuelCapacity=25;
     int mileage;
     public int mileageCalculation(int averageSpeed)
     {
         mileage=(int)((averageSpeed)*fuelCapacity*0.1);
         return mileage;
     }
     public int accelerate(int speed)
     {
         return  speed+5;
     }
     public int deAccelerate(int speed)
     {
         return  speed-5;
     }

 }
 class Bike extends Vehicle
 {
     int wheels=2;
     int seatingCapacity=2;
     int fuelCapacity=5;

 }
 class Car extends Vehicle{
    int wheels=4;
    int seatingCapacity=5;
    public int reverse()
    {
        return -10;
    }
     public int accelerate(int speed)
     {
         return  speed+20;
     }
     public int mileageCalculation(int averageSpeed)
     {
         mileage=(int)((averageSpeed)*fuelCapacity*0.05);
         return mileage;
     }


 }
 class Lorry extends Vehicle
 {
     public int reverse()
     {
         return -5;
     }
     public int mileageCalculation(int averageSpeed)
     {
         mileage=(int)((averageSpeed)*fuelCapacity*0.025);
         return mileage;
     }
 }

