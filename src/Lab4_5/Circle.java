package Lab4_5;

import java.awt.*;

public class Circle extends Shape {
    Circle(Graphics g){
        getColor();
        getPosition();
        paint(g);
    }
    @Override
    public void getColor() {
        r = (int) (Math.random()*255);
        g = (int) (Math.random()*255);
        b = (int) (Math.random()*255);
    }

    @Override
    public void getPosition() {
        x= (int) (Math.random()*500);
        y= (int) (Math.random()*500);
        w = (int) (Math.random()*50);
        h = (int) (Math.random()*50);
    }

    @Override
    public void paint(Graphics g) {
       // Graphics2D gr=(Graphics2D)g.create()
        Graphics2D gr=(Graphics2D)g;
        gr.setPaint(new Color(r,this.g,b));
        gr.drawOval(x,y,w,h);
    }

}
