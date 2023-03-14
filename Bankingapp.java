import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Bankingapp extends Frame implements ActionListener
{
static double a=0,b=0.0;
TextField t1,t2;
Button b1,b2;
Label l1,l2,l3,l4,l5;


Bankingapp()
{

t1=new TextField(20);
add(t1);
t1.setBounds(550,350,100,20);
t1.setForeground(Color.BLACK);

t2=new TextField(20);
add(t2);
t2.setBounds(600,750,100,20);
t2.setForeground(Color.BLACK);

b1=new Button("Deposit");
add(b1);
b1.setBounds(350,550,100,20);
b1.setForeground(Color.BLACK);

b2=new Button("Withdraw");
add(b2);
b2.setBounds(550,550,100,20);
b2.setForeground(Color.BLACK);

l1=new Label("JOHIN  PVT BANK LTD");
add(l1);
l1.setBounds(450,50,150,20);

l2=new Label("BANKING APPLICATION");
add(l2);
l2.setBounds(450,200,150,20);

l3=new Label("Amount : ");
add(l3);
l3.setBounds(350,350,100,20);

l4=new Label("Available Balance in Account : ");
add(l4);
l4.setBounds(300,750,200,20);

l5=new Label("Thanks");
add(l5);
l5.setBounds(850,750,200,20);

Color co=new Color(46,2,100);
setBackground(Color.BLACK);
setForeground(Color.WHITE);
setVisible(true);
setSize(1000,850);
setTitle("JOHIN BANK");
setResizable(false);
setLayout(null);

b1.addActionListener(this);
b2.addActionListener(this);


addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
}
public void actionPerformed(ActionEvent j)
{
if(j.getSource()==b1)
{
if(t1.getText()!=null && t1.getText().length()>0)
{
try
{
a=Double.parseDouble(t1.getText());
b=b+a;
String result=String.valueOf(b);
t2.setText(result);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
if(j.getSource()==b2)
{
if(t1.getText()!=null && t1.getText().length()>0)
{
try
{
a=Double.parseDouble(t1.getText());
b=b-a;
String result=String.valueOf(b);
t2.setText(result);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
}
public static void main(String []args)
{
Bankingapp bap=new Bankingapp();
}
}