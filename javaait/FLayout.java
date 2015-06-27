import javax.swing.*;
import java.awt.*;

//refer LayoutManagers.txt
//refer LayoutManagers.png

class FLayout extends JFrame
{
 JButton bttn1, bttn2, bttn3, bttn4, bttn5;

 FLayout()
 {
   bttn1 = new JButton("B1");
   bttn2 = new JButton("B2");
   bttn3 = new JButton("B3");
   bttn4 = new JButton("B4");
   bttn5 = new JButton("B5");
   
   Dimension d1 = new Dimension(200,200);//w,h
   Dimension d2 = new Dimension(50,50);//w,h
   Dimension d3 = new Dimension(200,50);//w,h

   bttn1.setPreferredSize(d1);
   bttn2.setPreferredSize(d2);
   bttn3.setPreferredSize(d3);

   //this window will arrange the components
   //as per the approach used by FlowLayout
  
   setLayout(new FlowLayout());
   //setLayout(new FlowLayout(FlowLayout.LEFT));
   //setLayout(new FlowLayout(FlowLayout.RIGHT));

   add(bttn1);
   add(bttn2);
   add(bttn3);
   add(bttn4);
   add(bttn5);

   setTitle("Flow Layout");
   setSize(400, 300);
   setVisible(true);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
 public static void main(String args[])
 {
   new FLayout(); 
 }//main
}//FLayout