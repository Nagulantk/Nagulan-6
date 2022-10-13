public class Main {
    public static void main(String[] args) {

        HybridCar car=new HybridCar();
        System.out.println("Fuel capacity:"+car.fuelCapacity);
        System.out.println("Deaccelarate");
       System.out.println( car.deAccelerate(100));
        System.out.println("Accelarate");
        System.out.println(car.accelerate(70));
        System.out.println("BatteryCapacity:"+car.batteryCapacity);
        System.out.println("Battery:"+car.batteryDrainage(90));

        Car car1=new Car();
        System.out.println("Fuel capacity:"+car1.fuelCapacity);
        System.out.println("Deaccelarate");
        System.out.println( car.deAccelerate(100));
        System.out.println("Accelarate");
        System.out.println(car.accelerate(70));

    }
}
class Vehicle
{
    int fuelCapacity;
    int maxSpeed;
    public int accelerate(int speed)
    {
        speed=speed+5;
        return speed;
    }
    public int deAccelerate(int speed)
    {
        speed=speed-5;return speed;
    }
    public void fuelDrainage(int distance)
    {
        fuelCapacity=fuelCapacity-distance*2;
    }
    
}
class Car extends Vehicle
{
   int fuelCapacity=50;
   int maxSpeed=150;
    public int accelerate(int speed)
    {
        speed=speed+10;
        return speed;
    }
    public int deAccelerate(int speed)
    {
        speed=speed-10;
       return speed;
    }
}
class HybridCar extends Car
{
    int batteryCapacity=50000;
   int  fuelCapacity=25;
    public int accelerate(int speed)
    {
        speed=speed+8;
        return speed;
    }
    public int batteryDrainage(int distance)
    {
        batteryCapacity=batteryCapacity-distance*200;
        return batteryCapacity;
    }
    
}