import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Second extends JFrame implements ActionListener
{
JFrame jo;
JLabel l21,l22,l23;
JMenuBar mb;
JMenu m1,m2,m3,m4,m5,m6;
JMenuItem i1,i2,i3;

Second()
{
jo=new JFrame("HOME PAGE");
mb=new JMenuBar();

l21=new JLabel("Welcome to JOHIN Pvt Bank Ltd");
jo.add(l21);
l21.setBounds(150,140,200,20);
l21.setForeground(Color.RED);
l22=new JLabel("Always for All");
jo.add(l22);
l22.setBounds(200,240,100,20);
m1=new JMenu("File");
mb.add(m1);

m2=new JMenu("Edit");
mb.add(m2);

m3=new JMenu("View");
mb.add(m3);

m4=new JMenu("Option");
mb.add(m4);

m5=new JMenu("Window");
mb.add(m5);

m6=new JMenu("Help");
mb.add(m6);

i1=new JMenuItem("Banking Operation");
i2=new JMenuItem("Open new Account");
i3=new JMenuItem("Quit");
m1.add(i1);
m1.add(i2);
m1.add(i3);

l23=new JLabel("");
jo.add(l23);
l23.setBounds(0,0,0,0);

i1.addActionListener(this);
i2.addActionListener(this);
i3.addActionListener(this);

jo.setVisible(true);
jo.setSize(500,500);
jo.setResizable(false);
jo.setLayout(null);
jo.setJMenuBar(mb);
jo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent j)
{
if(j.getActionCommand()=="Banking Operation")
{
Bankingapp doll=new Bankingapp();
doll.setVisible(true);
}
if(j.getActionCommand()=="Open new Account")
{
BankAccountOpening ball=new BankAccountOpening();
ball.setVisible(true);
}
if(j.getActionCommand()=="Quit")
{
System.exit(0);
}
}
public static void main(String []args)
{
Second se=new Second();
}
}
