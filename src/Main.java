abstract class Vehicle
{
    abstract void start();
    abstract void stop();
}
class Car extends Vehicle
{
    void start()
    {
        System.out.println("Car Started");
    }
    void stop()
    {
        System.out.println("Car Stoped");
    }
}
class Motorcycle extends Vehicle
{
    void start()
    {
        System.out.println("Motorcycle Started");
    }
    void stop()
    {
        System.out.println("Motorcycle Stoped");
    }
}
public class Main {
    public static void main(String[] args) {

        Car car=new Car();
        Motorcycle motorcycle=new Motorcycle();
        car.start();
        car.stop();
        motorcycle.start();
        motorcycle.stop();
    }
}