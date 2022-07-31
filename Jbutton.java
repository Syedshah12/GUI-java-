import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class Jbutton extends JFrame implements ActionListener {
    JButton btn;
    JLabel lbl;
    int count=0;
    Jbutton(){
        lbl=new JLabel();
        lbl.setText("hello:");
        lbl.setBounds(600,150,100,100);
        lbl.setVisible(false);
     btn=new JButton("click me!");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setTitle("JButton");
        this.setLayout(new BorderLayout());
        this.add(btn);
        btn.setBounds(600,300,100,50);
        btn.setFocusable(false);
        btn.setForeground(Color.blue);
        btn.addActionListener(this);
  this.add(lbl);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==btn){
            lbl.setVisible(true);
            count=count+1;
            lbl.setText("Button clicked :"+count);
        }
    }
    public static  void main (String args[]){
        new Jbutton();
        new JLabel();
    }
}
