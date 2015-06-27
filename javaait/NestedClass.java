/*
Java allows declaration of nested classes.

A nested class is a class defined inside 
1) a class 
2) functions or blocks of codes.

---------------------------------------
A nested class defined inside a class 

1) Acts as a member of the class.
2) Can directly access all other members 
(variables, functions, nested classes) of 
the class.
3) Can be static or non-static (default).

3.a) non static nested class (inner class)
* can be used (by the members of enclosing 
class) through object of the class.
* can access all the members of the class.
* cannot have static members.

3.b) static nested class 
* can be directly used in the class
* can access static members of the 
enclosing class.
* can have static and non static members.

4) Bytecode name : outer$inner.class
---------------------------------------
A nested class defined inside a function or a block of code
is also called as "local inner class"

1) Acts as a local entity of the function.
2) Can be non-static only.
3) Cannot have static members.
4) Can directly access all other members 
(variables, functions, nested classes) of 
the enclosing class of the enclosing function.
5) Can be used in the local function/block 
of code only.
6) Bytecode name : outer$Ninner.class
where N is a autoincremented number starting from 1.
*/

class Outer
{
 int x, y; //non static member variables
 static int z= 100;//static member variable

 Outer()
 {
  System.out.println("Outer()");
  x =1;
  y =2;
 }//Outer()

 void disp()
 {
  System.out.println(x + " " + y + " " + z); 
 }//disp

 //a non static nested class defined inside a class
 class Inner1 
 {
  int tot; //a non static member variable

  Inner1()
  {
   System.out.println("Inner1()");
   tot = 0;
  }
 
  void add()//a non static member function of a nested class
  {
    disp();//using member function of Outer class
    tot = x + y + z;//using members of Outer class
    System.out.println("Addition : " + tot);
  } 
 }//class Inner1


 class Inner2
 {
  int max;
  Inner2()
  {
    System.out.println("Inner2()");
    max = 0;
  } 

  void getMax()
  {
     disp();//using member fn of outer class 
 
     //using member variables of outer class
     if(x > y && x > z)
       System.out.println(" max : " + x );
     else if(y > z)
       System.out.println(" max : " + y );
     else
       System.out.println(" max : " + z );
  
  }
 
  void useSiblingClass()
  {
   //this is inner2
   //its siblings are
   //x, y, z, disp and Inner1      

   Inner1 i1 = new Inner1();
   i1.add();
  }  
   
 }//class Inner2

 
 void useInner2()//a non static member fn of Outer class
 {
   Inner2 i2 = new Inner2();
   i2.getMax();
   i2.useSiblingClass();
 
 }

 static class SNested
 {
   int a = 5;//non static members
   static int b= 6;//static members

   void display()
   {
     //disp(); // cannot use a non static member
     //Inner1 i1 = new Inner1();//// cannot use a non static member

     System.out.println("Display of SNested");
     System.out.println(a + "  " + b);
     System.out.println("z of Outer :" + z);

   }  
 } //static nested class


 void localClassTest()
 {
   System.out.println("----------LocalClassTest Starts----------");
   final int i = 10;

   class LocalI1
   {
     int p;//mem var

     LocalI1()//constructor
     {
       System.out.println("LocalI1");
       p = x + y + z + i;
       //being inside a non static fn
       //this class can use 
       //all static and non static members
       //of the class of the enclosing fn
       //and can use final local variables of
       //the enclosing fn.
     }

     void test()//mem fn
     {
       System.out.println(x + " + " + y + " + " + z  +  " + "  + i + " = " + p);
    
     }
      
   }//localI1

   //use the local inner class
   LocalI1 li1 = new LocalI1();
   li1.test();
   System.out.println("----------LocalClassTest Ends----------");
 }
}

class NestedClass
{
 public static void main(String args[])
 {

  System.out.println("-------Using Non Static Nested Classes ------------");
   Outer o= new Outer();

   o.useInner2();


   System.out.println("-------Using Static Nested Class ------------");
   Outer.SNested sn = new Outer.SNested();
   sn.display();

   o.localClassTest();

 }//main

}//NestedClass
