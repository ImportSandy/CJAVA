import javax.swing.*;
import java.awt.*;

//refer LayoutManagers.txt
//refer LayoutManagers.png

class BLayout extends JFrame
{
 JButton bttn1, bttn2, bttn3, bttn4, bttn5;

 BLayout()
 {
   bttn1 = new JButton("B1");
   bttn2 = new JButton("B2");
   bttn3 = new JButton("B3");
   bttn4 = new JButton("B4");
   bttn5 = new JButton("B5");
   
   Dimension d1 = new Dimension(200,200);//w,h
   bttn1.setPreferredSize(d1);
  

   //this window will arrange the components
   //as per the approach used by BorderLayout
  
   setLayout(new BorderLayout());

   add(bttn1, BorderLayout.EAST);
   add(bttn2, BorderLayout.WEST);
   add(bttn3, BorderLayout.NORTH);
   add(bttn4, BorderLayout.SOUTH);
   add(bttn5, BorderLayout.CENTER);

   setTitle("Border Layout");
   setSize(400, 300);
   setVisible(true);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
 public static void main(String args[])
 {
   new BLayout(); 
 }//main
}//BLayout