/*
Program to Generate Numbers
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class NumberGenerator1 extends JFrame implements Runnable
{

 JLabel lblNumbers;
 JTextField txtNumbers;
 JButton bttnStart, bttnStop;
 int x;
 boolean threadFlag;
 Thread thrd;

 Color c, c1;

 NumberGenerator1()
 {
   x =0 ;
   initComponents();
   setTitle("Number Generator1");
   setSize(400,300);//w,h
   setVisible(true);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
 }

 final void initComponents()
 {
   //create the components
   lblNumbers = new JLabel("Numbers");
   txtNumbers = new JTextField();
   bttnStart = new JButton("Start");
   bttnStop = new JButton("Stop");  

   //attribute settings
   Font f = new Font("Arial", Font.PLAIN, 30);//name, style, size
   txtNumbers.setFont(f);
   lblNumbers.setFont(f);
   txtNumbers.setEditable(false); 
   //txtNumbers.setEnabled(false);
   c = new Color(112,146,190);//r,g,b
   c1 = new Color(170,190,210);//r,g,b

   bttnStart.setBackground(c);
   bttnStop.setBackground(c1);
   //bttnStop.setEnabled(false);	
   txtNumbers.setBackground(Color.YELLOW);
   txtNumbers.setForeground(Color.RED);

   //add the components into the window
   add(lblNumbers);
   add(txtNumbers);
   add(bttnStart);
   add(bttnStop);
  
   //arrange the components explicitly
   setLayout(null);
   lblNumbers.setBounds(30,50,150,50);//x,y,w,h
   txtNumbers.setBounds(210,50,100,50);//x,y,w,h

   bttnStart.setBounds(30,150,125,50);//x,y,w,h
   bttnStop.setBounds(185,150,125,50);//x,y,w,h
   
   //event enable the buttons
   A objA = new A();
   B objB = new B();
   bttnStart.addActionListener(objA);
   bttnStop.addActionListener(objB);

   bttnStop.setEnabled(false);

 }

 
 void start()//bttnStartClick
 {
   threadFlag = true;
   thrd = new Thread(this);
   thrd.start(); 
 
   bttnStart.setEnabled(false);
   bttnStop.setEnabled(true);
   bttnStart.setBackground(c1);
   bttnStop.setBackground(c);

 }

 void stop()//bttnStopClick
 {
   threadFlag = false;
   bttnStart.setEnabled(true);
   bttnStop.setEnabled(false);
   bttnStart.setBackground(c);
   bttnStop.setBackground(c1);

 }

 public void run()
 {
   while(threadFlag == true)
   {
    x++;//seq next number
    txtNumbers.setText(String.valueOf(x));//update in text field

    try
    {
      Thread.sleep(1000);
    }
    catch(InterruptedException ex)
    {}
   }//while
 }//run

//these classes are nested in NumberGenerator1
//because being nested they become members of
//the outer class and get accessibility of
//other members of the outer class

 class A implements ActionListener 
 {
  //override of ActionListener
  public void actionPerformed(ActionEvent e)
  {
   start();
  }
 }

 class B implements ActionListener
 {
  //override of ActionListener
  public void actionPerformed(ActionEvent e)
  {
   stop();
  }
 }


 public static void main(String args[])
 {
  NumberGenerator1 ng1 = new NumberGenerator1();
 }//main
}//NumberGenerator1


/*
*Create a window
*Create GUI components
*Add the GUI components to the window
*Arrange the GUI components


addActionListener is a method defined
in class JButton

On call it activates an event monitor
for the current object.

On event it uses the parameter object
to call back the event procedure.
(actionPerformed).
*/

