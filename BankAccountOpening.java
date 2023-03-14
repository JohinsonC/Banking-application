import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class BankAccountOpening extends Frame implements ActionListener 
{
BankAccountOpening()
{
Color co=new Color(46,2,100);
setBackground(Color.BLACK);
setForeground(Color.WHITE);
setLayout(null);
Label l1=new Label("Bank Account Opening form");
add(l1);
l1.setBounds(400,50,200,20);
Label l2=new Label("First name");
add(l2);
l2.setBounds(150,150,100,20);
TextField t1=new TextField(20);
add(t1);
t1.setBounds(300,150,150,20);
t1.setForeground(Color.BLACK);
Label l3=new Label("Last name");
add(l3);
l3.setBounds(525,150,100,20);
TextField t2=new TextField(20);
add(t2);
t2.setBounds(675,150,150,20);
t2.setForeground(Color.BLACK);
Label l5=new Label("Father's Name");
add(l5);
l5.setBounds(150,250,100,20);
TextField t3=new TextField(20);
add(t3);
t3.setBounds(300,250,150,20);
t3.setForeground(Color.BLACK);
Label l4=new Label("Address");
add(l4);
l4.setBounds(525,250,100,20);
TextArea a=new TextArea(20,20);
add(a);
a.setBounds(675,250,150,75);
a.setForeground(Color.BLACK);
Label l6=new Label("Gender");
add(l6);
l6.setBounds(150,350,100,20);
CheckboxGroup cbg=new CheckboxGroup();
Checkbox c4=new Checkbox("Male",cbg,false);
add(c4);
c4.setBounds(300,350,150,20);
Checkbox c5=new Checkbox("Female",cbg,false);
add(c5);
c5.setBounds(525,350,100,20);
Checkbox c6=new Checkbox("Transgender",cbg,false);
add(c6);
c6.setBounds(750,350,150,20);
Label l8=new Label("Account Type");
add(l8);
l8.setBounds(150,450,100,20);
Checkbox c1=new Checkbox("SB");
add(c1);
c1.setBounds(300,450,150,20);
Checkbox c2=new Checkbox("CA");
add(c2);
c2.setBounds(525,450,100,20);
Checkbox c3=new Checkbox("Loan");
add(c3);
c3.setBounds(750,450,150,20);
Label l7=new Label("Date of Birth : Date :");
add(l7);
l7.setBounds(150,550,100,20);
Choice ch1=new Choice();
ch1.add("1");
ch1.add("2");
ch1.add("3");
ch1.add("4");
ch1.add("5");
ch1.add("6");
ch1.add("7");
ch1.add("8");
ch1.add("9");
ch1.add("10");
ch1.add("11");
ch1.add("12");
ch1.add("13");
ch1.add("14");
ch1.add("15");
ch1.add("16");
ch1.add("17");
ch1.add("18");
ch1.add("19");
ch1.add("20");
ch1.add("21");
ch1.add("22");
ch1.add("23");
ch1.add("24");
ch1.add("25");
ch1.add("26");
ch1.add("27");
ch1.add("28");
ch1.add("29");
ch1.add("30");
ch1.add("31");
add(ch1);
ch1.setBounds(275,550,50,20);
ch1.setForeground(Color.BLACK);
Label l10=new Label("Month :");
add(l10);
l10.setBounds(350,550,75,20);
Choice ch2=new Choice();
ch2.add("January");
ch2.add("February");
ch2.add("March");
ch2.add("April");
ch2.add("May");
ch2.add("June");
ch2.add("July");
ch2.add("August");
ch2.add("September");
ch2.add("October");
ch2.add("November");
ch2.add("December");
add(ch2);
ch2.setBounds(450,550,100,20);
ch2.setForeground(Color.BLACK);
Label l11=new Label("Year :");
add(l11);
l11.setBounds(575,550,50,20);
Choice ch3=new Choice();
ch3.add("1991");
ch3.add("1992");
ch3.add("1993");
ch3.add("1994");
ch3.add("1995");
ch3.add("1996");
ch3.add("1997");
ch3.add("1998");
ch3.add("1999");
ch3.add("2000");
ch3.add("2001");
ch3.add("2002");
ch3.add("2003");
ch3.add("2004");
ch3.add("2005");
ch3.add("2006");
ch3.add("2007");
ch3.add("2008");
ch3.add("2009");
ch3.add("2010");
ch3.add("2011");
ch3.add("2012");
ch3.add("2013");
ch3.add("2014");
ch3.add("2015");
ch3.add("2016");
ch3.add("2017");
ch3.add("2018");
ch3.add("2019");
ch3.add("2020");
ch3.add("2021");
ch3.add("2022");
add(ch3);
ch3.setBounds(650,550,75,20);
ch3.setForeground(Color.BLACK);
Label l9=new Label("Contact Number");
add(l9);
l9.setBounds(150,650,100,20);
TextField t5=new TextField(20);
add(t5);
t5.setBounds(300,650,100,20);
t5.setForeground(Color.BLACK);
Label l12=new Label("ID Proof");
add(l12);
l12.setBounds(525,650,100,20);
Choice ch4=new Choice();
ch4.add("PAN");
ch4.add("Aadhar");
ch4.add("Driving License");
add(ch4);
ch4.setBounds(675,650,100,20);
ch4.setForeground(Color.BLACK);

Button b1=new Button("SUBMIT");
add(b1);
b1.setBounds(465,800,70,20);
b1.setForeground(Color.BLACK);

b1.addActionListener(this);

addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
setVisible(true);
setSize(1000,850);
setTitle("BankAccountOpening form");
setResizable(false);
}
public void actionPerformed(ActionEvent j)
{
if(j.getActionCommand()=="SUBMIT")
JOptionPane.showMessageDialog(this,"Congratulations,Your bank account is successfully created.","Login",JOptionPane.INFORMATION_MESSAGE);
}
public static void main(String args[])
{
BankAccountOpening r=new BankAccountOpening();
}
}