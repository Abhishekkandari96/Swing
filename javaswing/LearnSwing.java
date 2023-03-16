import javax.swing.*;
import java.awt.*;

public class LearnSwing {

    public static void main(String args[]) {
        JFrame frame = new JFrame();   //creating object of jframe class it can have empty constructor
        frame.setTitle("introduction");// title of object
        frame.setLocation(200,200);// positiona of gui in screen from top left corner
        frame.setSize(800,600); // size of jframe
        frame.setVisible(true); //  if true gui comes in screen// if false it will run but will not appear in screen
      // frame.setBackground(Color.black);// will color back of contentpane
        frame.getContentPane().setBackground(Color.yellow);//  content screen get color
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when i will clik close button of jframe exicution should finish
        // if a 10 line is not present jframe will not be close even when we click close button of j frame
    }
}
