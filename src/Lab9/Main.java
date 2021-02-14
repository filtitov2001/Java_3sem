package Lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Main  extends JFrame{
    private static int i =0;
    JButton button = new JButton("Start");
    public static void main(String[] args) throws IOException
    {

        new Main();

    }
    Shape shape;

    @Override
    public void paint(Graphics g)
    {

        Graphics2D graphics = (Graphics2D)g;
        graphics.setStroke(new BasicStroke(3));
        while(i<20){
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
            i++;



        }
        i=0;

    }
    Main(){

        setLayout(new FlowLayout());
        setSize(700,600);
        setLocation(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(button);
        setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    setVisible(false);
                    setVisible(true);

                }catch (Exception f){
                    f.getMessage();
                }

            }
        });

    }

}
