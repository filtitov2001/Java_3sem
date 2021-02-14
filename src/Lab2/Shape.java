package Lab2;

import java.util.Scanner;


public class Shape {
    private String name;
    private int square;
    private int perimeter;

    Shape(String name,int square,int perimeter){
        this.name=name;
        this.square=square;
        this.perimeter=perimeter;

    }

    public int getPerimeter() {
        return perimeter;
    }

    public int getSquare() {
        return square;
    }

    public String getName() {
        return name;
    }
}