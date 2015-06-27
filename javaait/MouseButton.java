import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseButton extends JFrame implements MouseListener
{
 JButton bttnTest;
 ImageIcon ic1, ic2;

 MouseButton()
 {
  initComponents();
  setSize(1000, 700);
  setVisible(true);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
 }

 void initComponents()
 {
   ic1 = new ImageIcon("img1.jpg");
   ic2 = new ImageIcon("img2.jpg");

   bttnTest = new JButton(ic1);
   setLayout(null);   
   add(bttnTest);
   bttnTest.setBounds(100,100,300,200);//x,y,w,h

   //enable event handling
   bttnTest.addMouseListener(this);
 }
 
 //5 methods of MouseListener 
 public void mouseClicked(MouseEvent e)
 {}
 public void mousePressed(MouseEvent e) 
 {}
 public void mouseReleased(MouseEvent e)
 {}

 public void mouseEntered(MouseEvent e)
 {
   bttnTest.setIcon(ic2);
 }

 public void mouseExited(MouseEvent e)
 {
   bttnTest.setIcon(ic1);
 }

 public static void main(String args[])
 {
  new MouseButton();
 }
}


