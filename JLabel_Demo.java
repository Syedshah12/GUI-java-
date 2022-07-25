import javax.swing.*;
import java.awt.*;



public class JLabel_Demo {
    public static void main(String args[]){


        ImageIcon img=new ImageIcon("img.jpg");

        JLabel label=new JLabel();
        label.setText("Computer logo Label");
        label.setIcon(img);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.green);
        label.setFont(new Font("name",Font.PLAIN,30));
        label.setIconTextGap(12);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//       label.setBounds(0,0,250,250);

        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
//        frame.setLayout(null);
//        frame.pack();





    }




}
