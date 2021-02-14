package Lab3;
import java.util.Scanner;

public class Circle {
    private int radius;
    private double square;
    private double dlina;
    Circle(int radius){
        this.radius=radius;
        dlina = (double) (2*3.14*this.radius);
        square = (double)(3.14*this.radius*this.radius);
    }

    public int getRadius() {
        return radius;
    }

    public double getDlina() {
        return dlina;
    }

    public double getSquare() {
        return square;
    }
}
