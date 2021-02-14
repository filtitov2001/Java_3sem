package Lab11;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Myapp extends JFrame
{
    private int attempts = 0;
    private int chislo;
    private int Value;
    private JButton button = new JButton("Угадать");
    private TextArea textArea = new TextArea("");

    public Myapp()
    {
        super("Practic_Work11");
        this.setLayout((LayoutManager)null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        button.setBounds(40, 80, 100, 50);
        textArea.setBounds(30, 30, 120, 50);
        this.add(button);
        this.add(textArea);
        this.chislo = (int)(Math.random() * 20);
        this.setSize(200, 200);
        setVisible(true);
        button.addActionListener((actionEvent) -> {
            while(attempts<3)
            {
                Value = Integer.parseInt(textArea.getText());
                attempts++;
                if (Value == this.chislo) {
                    this.setVisible(false);
                    this.dispose();
                    JOptionPane.showMessageDialog((Component)null, "Вы угадали число, отлично!");
                    break;
                }
                else if (Value < this.chislo) {
                    JOptionPane.showMessageDialog((Component)null, "Загаданное число больше чем " + Value);
                    textArea.setText("");
                } else {
                    JOptionPane.showMessageDialog((Component)null, "Загаданное число меньше чем " + Value);
                    textArea.setText("");
                }

            }
            textArea.setText("");
            if (this.attempts == 3 && Value != this.chislo) {
                JOptionPane.showMessageDialog((Component)null, "Попытки закончились, я загадал число " + this.chislo);
                this.setVisible(false);
                this.dispose();
            }

        });


    }




}