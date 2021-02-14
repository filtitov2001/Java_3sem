package Lab3;
import java.util.Scanner;


public class CircleTest {
    CircleTest(){
        Circle circle = new Circle((int) (Math.random()*30));
        System.out.println("Окружность с радиусом:" + circle.getRadius()+", площадью: "+ circle.getSquare()+", длиной: "+ circle.getDlina());
    }


}
