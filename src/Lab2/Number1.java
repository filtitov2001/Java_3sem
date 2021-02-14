package Lab2;

import java.util.Scanner;

public class Number1 {
    Number1() {
        int x= (int) (Math.random()*2);
        switch (x) {
            case 0:
                Shape circle = new Shape("круг", 20, 30);
                System.out.println("Фигура: " + circle.getName() + " c площадью " + circle.getSquare() + " и периметром " + circle.getPerimeter());
                break;
            case 1:
                Shape square = new Shape("квадрат", 200, 300);
                System.out.println("Фигура: " + square.getName() + " c площадью " + square.getSquare() + " и периметром " + square.getPerimeter());
                break;
        }

    }
}