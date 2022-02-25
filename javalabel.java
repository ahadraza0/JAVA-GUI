import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class javalabel 
{
    public static void main(String[] args)
    {
        //JLabel = a gui display area for a string of text an image or both
        ImageIcon image = new ImageIcon("download.png");
        Border border = BorderFactory.createLineBorder(Color.yellow,3);
        JLabel label = new JLabel(); //create a label
        label.setText("Hello everyone my name is abdul ahad raza");// set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.white);
        label.setIconTextGap(-25);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.add(label);
        
    }
}

