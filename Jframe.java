import javax.swing.*;
import java.awt.*;

class jframe{
    public static void main(String args[]){
        JFrame frame=new JFrame();
        ImageIcon img=new ImageIcon("logo.png");
        frame.setVisible(true);
        frame.setSize(200,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("First GUI");
        frame.setIconImage(img.getImage());
         frame.getContentPane().setBackground(new Color(0,0,0));

    }

}