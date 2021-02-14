package Lab12;

import javax.swing.*;

public class Main extends JFrame {

    public static void main(String[] args) {
        new Main();

    }

    public Main(){

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,Planets.values().length * 115);


        for (int i = 0; i < Planets.values().length; i++)
        {
            Planets planet = Planets.values()[i];
            JButton jButton = new JButton(planet.toString());
            JLabel label = new JLabel();
            label.setBounds(0,i * 110,200,110);
            jButton.setBounds(0,0,200,110);

            jButton.addActionListener( actionListener -> {

                JLabel weight = new JLabel("Weight = " + planet.getMass() + " kg");
                weight.setBounds(0,25,200,20);

                label.add(weight);

                JLabel radius = new JLabel("Radius = " + planet.getRad() + " m");
                radius.setBounds(0,50,200,20);

                label.add(radius);

                JLabel gravity = new JLabel("Gravity = " + planet.getGravity() + " H");
                gravity.setBounds(0,75,200,20);
                label.add(gravity);

                jButton.setVisible(false);
                label.repaint();

            });

            label.add(jButton);

            add(label);
        }

        setLocationRelativeTo(null);
        setVisible(true);
    }
}