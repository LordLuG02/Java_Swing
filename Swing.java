import javax.swing.*;
import java.awt.*;

public class Swing {
    public static void main(String [] args){
        JFrame frame=new JFrame();//creates a frame
        frame.setResizable(false);//prevent frame from being resized
        frame.setTitle("Java Swing Learning");//sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        frame.setVisible(true);//make frame visible
        frame.setSize(420,420);//set width and height
        ImageIcon image=new ImageIcon("");//create an ImageIcon
        frame.setIconImage(image.getImage());//change icon of frame
        frame.getContentPane().setBackground(new Color(123,50,250));//change color of background

    }

}
