package Lab8;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public static void main(String[] args) {
    new Main();
    }
    Shape shape;

    @Override
    public void paint(Graphics g) {

        //super.paint(g);
        Graphics2D graphics = (Graphics2D)g;
        graphics.setStroke(new BasicStroke(3));
        for(int i=0;i<20;i++){
            int a = (int) (1+Math.random()*3);
            switch (a){
                case(1):
                    shape = new Circle(g);
                    break;
                case(2):
                    shape = new Triangle(g);
                    break;
                case(3):
                    shape = new Square(g);
            }
            shape.paint(g);


        }
    }
    Main(){

        setSize(700,600);
        setLocation(500,300);
        setVisible(true);
    }
}
