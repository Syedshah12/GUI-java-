
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;

class Myframe extends JFrame {
    Myframe(){
        this.add(new MyButton());
        ImageIcon icon=new ImageIcon("icon.png");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setTitle("working on Gui");
        this.add(new MyLabel());
        this.add(new MyButton());
    }

}
class MyLabel extends JLabel{
    MyLabel(){

        super("hello");
        this.setForeground(Color.BLACK);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setBounds(200,200,200,200);
        this.setOpaque(true);


    }
}
class MyButton extends JButton{
    MyButton(){
        super("ClickMe");
        this.setBounds(100,100,150,150);
        this.setFocusable(false);
        this.setForeground(Color.BLUE);
    }
}

class GUIConstructormethod{
    public static  void main(String args[]){
        new Myframe();
        new MyLabel();
        new MyButton();
    }




}

