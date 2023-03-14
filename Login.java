import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Login extends JFrame implements ActionListener
{
JTextField t11;
JPasswordField t12;
JButton b11,b12;
JLabel l10,l11,l12,l13,l14;
JFrame jf=new JFrame();

Login()
{
l10=new JLabel("JOHIN PVT BANK");
jf.add(l10);
l10.setBounds(200,30,100,20);

l11=new JLabel(" User Name");
jf.add(l11);
l11.setBounds(150,130,75,20);

t11=new JTextField();
jf.add(t11);
t11.setBounds(280,130,100,20);

l12=new JLabel("  Password");
jf.add(l12);
l12.setBounds(150,230,75,20);

t12=new JPasswordField();
jf.add(t12);
t12.setBounds(280,230,100,20);

b11=new JButton("Login");
jf.add(b11);
b11.setBounds(100,330,100,20);

b12=new JButton("Cancel");
jf.add(b12);
b12.setBounds(300,330,100,20);

l13=new JLabel("  Welcome to JOHIN BANK");
jf.add(l13);
l13.setBounds(175,400,150,15);

l14=new JLabel("");
jf.add(l14);
l14.setBounds(0,0,0,0);

jf.setVisible(true);
jf.setSize(500,500);
jf.setTitle("Login Page");
jf.setResizable(false);
jf.setLayout(null);

jf.getContentPane().setBackground(Color.WHITE);
jf.getContentPane().setForeground(Color.BLACK);

b11.addActionListener(this);
b12.addActionListener(this);

jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent j)
{
if(j.getActionCommand()=="Login")
{
if(t11.getText().equals("Johin")&&(t12.getText().equals("pass")))
{
Second call=new Second();
call.setVisible(true);
}
else
JOptionPane.showMessageDialog(this,"Invalid username or password","Login",JOptionPane.ERROR_MESSAGE);
}
else
System.exit(0);
}
public static void main(String []args)
{
Login lg=new Login();
}
}