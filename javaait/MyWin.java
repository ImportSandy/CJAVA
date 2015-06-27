/*
Program to 
*Create a Window
*Set Title
*Set Size
*Set Visible
*Set Multiple Close Behaviours

*/

import javax.swing.*;

class MyWin extends JFrame
{
 MyWin(String s)
 {
   setTitle(s);
   setSize(400,200);//w,h
   setVisible(true);
   //setDefaultCloseOperation(HIDE_ON_CLOSE);//default
   //setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
   //setDefaultCloseOperation(EXIT_ON_CLOSE);
   setDefaultCloseOperation(DISPOSE_ON_CLOSE);
 }
 public static void main(String args[])
 {
  MyWin mw1 = new MyWin("Window1");
  MyWin mw2 = new MyWin("Window2"); 
 }//main
}//MyWin

/*
Steps
1) Define a class that extends JFrame
2) Every object of such a class is a window 
3) Set its primary attributes as shown in constructor.
*/
