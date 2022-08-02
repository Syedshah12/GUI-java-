import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class Gui extends JFrame implements ItemListener, ActionListener {
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JPanel pnl;
    JPanel pnl2;
    List lst;
    List lst2;
    Gui(){
         btn1=new JButton("<");
         btn2=new JButton(">");
         btn3=new JButton("<<");
         pnl=new JPanel();
         pnl2=new JPanel();

        pnl2.setBounds(200,50,150,100);
        pnl.setBounds(30,50,150,100);
         lst=new List(6,false);
         lst2=new List(6,false);
//        lst.setBounds(10,10,20,100);
        lst.add("Mercury");
        lst.add("Venus");
        lst.add("Earth");
        lst.add("JavaSoft");
        lst.add("Mars");
        lst2.add("Jupiter");
        lst2.add("Saturn");
        lst2.add("Uranus");
        lst2.add("Neptune");
        lst2.add("Pluto");
        pnl.add(lst);
        pnl2.add(lst2);
        lst2.addItemListener(this);
        lst.addItemListener(this);
  btn1.setBounds(30,300,100,40);
        btn2.setBounds(130,300,100,40);
        btn3.setBounds(230,300,100,40);
       btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setLayout(null);
        this.setVisible(true);
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);
  this.add(pnl);
        this.add(pnl2);



    }
public static  void main(String args[]){
        new Gui();
}


    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==btn1){
    String item=lst2.getSelectedItem();
    lst.add(item);
    lst2.remove(item);
}
        if(e.getSource()==btn2){
            String item=lst.getSelectedItem();
            lst2.add(item);
            lst.remove(item);
        }
        if(e.getSource()==btn3){
        String arr[]={lst2.getItem(0),lst2.getItem(1),lst2.getItem(2),lst2.getItem(3),lst2.getItem(4)};
     for(int i=0;i<arr.length;i++){
         lst.add(arr[i]);
         lst2.removeAll();
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}