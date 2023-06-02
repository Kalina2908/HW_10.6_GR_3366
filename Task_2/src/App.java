import Domen.Bus;
import Domen.Car;


public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car(200.1, "какой-то тип", 123);
        Bus bus1 = new Bus(150.6, "какой-то автобус", 567);

       
        System.out.println(car1.calculateAllowedSpeed());
        System.out.println(bus1.calculateAllowedSpeed());
    }   
}
