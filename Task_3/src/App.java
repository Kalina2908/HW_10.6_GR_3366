import Domen.Circle;
import Domen.Cube;

public class App {
    public static void main(String[] args) throws Exception {
        Circle circle1 = new Circle(15.2);
        Cube cube1 = new Cube(5);

        
        System.out.println(circle1.area());
        System.out.println(cube1.area());
        System.out.println(cube1.volume());
    }
}
