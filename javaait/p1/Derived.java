package p1;

public class Derived extends Base
{
 //attempt to access members of the
 //super class

 public Derived()
 {
  System.out.println("p1 Derived Derived()");
  //i++;
  j++;
  k++;
  l++;
 }
 
 public void display() //override
 {
  System.out.println("p1 Derived display()");
  System.out.println("i : not accessible");
  System.out.println("j : "+ j);
  System.out.println("k : "+ k);
  System.out.println("l : "+ l);
  System.out.println("=============");
  super.display(); 

 }
}//Derived