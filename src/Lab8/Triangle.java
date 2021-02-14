package Lab8;

import java.awt.*;

public class Triangle extends Shape {
    Triangle(Graphics g){
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
        x2 = (int) (Math.random()*500);
        y2 = (int) (Math.random()*500);
        x3 = (int) (Math.random()*500);
        y3 = (int) (Math.random()*500);
        w = (int) (Math.random()*250);
        h = (int) (Math.random()*250);

    }
    @Override
    public void paint(Graphics g) {
        Graphics2D gra=(Graphics2D)g;
        gra.setPaint(new Color(r,this.g,b));

        Polygon polygon = new Polygon();
        polygon.addPoint(x,y);
        polygon.addPoint(x2,y2);
        polygon.addPoint(x3,y3);
        g.drawPolygon(polygon);

    }
}
