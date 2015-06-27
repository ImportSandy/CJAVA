import javax.swing.*;
import java.awt.*;

//refer LayoutManagers.txt
//refer LayoutManagers.png

class GLayout extends JFrame
{
 JButton bttn1, bttn2, bttn3, bttn4, bttn5, bttn6;

 GLayout()
 {
   bttn1 = new JButton("B1");
   bttn2 = new JButton("B2");
   bttn3 = new JButton("B3");
   bttn4 = new JButton("B4");
   bttn5 = new JButton("B5");
   bttn6 = new JButton("B6");

   Dimension d1 = new Dimension(200,200);//w,h
   Dimension d2 = new Dimension(50,50);//w,h
   Dimension d3 = new Dimension(200,50);//w,h

   bttn1.setPreferredSize(d1);
   bttn2.setPreferredSize(d2);
   bttn3.setPreferredSize(d3);

   //this window will arrange the components
   //as per the approach used by GridLayout
  
  // setLayout(new GridLayout(2,3));//r,c
   setLayout(new GridLayout(2,3,10,10));//r,c,hGap,vGap

   add(bttn1);//cell(0,0)
   add(bttn2);//cell(0,1)
   add(bttn3);//cell(0,2)
   add(bttn4);//cell(1,0)
   add(bttn5);//...
   add(bttn6);

   setTitle("Grid Layout");
   setSize(400, 300);
   setVisible(true);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
 public static void main(String args[])
 {
   new GLayout(); 
 }//main
}//GLayout