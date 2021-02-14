package Lab8;
import java.awt.*;

public class Square extends Shape {
    @Override
    public void getColor() {
        r = (int) (Math.random() * 255);
        b = (int) (Math.random() * 255);
        g = (int) (Math.random() * 255);
    }

    @Override
    public void getPosition() {
        x = (int) (Math.random()*500);
        y = (int) (Math.random()*500);
        w = (int) (Math.random()*200);
        h = (int) (Math.random()*200);

    }
    @Override
    public void paint(Graphics g) {
        Graphics2D gr =  (Graphics2D) g;
        gr.setPaint(new Color(r, this.g, b));
        gr.drawRect(x,y,w,h);
    }
    Square(Graphics g){
        getColor();
        getPosition();
        paint(g);
    }

}
