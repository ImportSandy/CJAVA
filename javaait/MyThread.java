/*
Generally an application performs a
task, that is a combination of multiple
sub-tasks.

Every application is single threaded
by default and hence performs its
sub tasks sequentially.
And for an application to perform its 
sub-tasks concurrently it must be 
multi threaded.

Java supports creation of multi threaded
applications by 
1) Define a class that extends Thread class
2) Define class that implements Runnable interface and uses Thread object

--------------------------------------
Implementing multiuthreading by defining
a class that extends Thread

1) Define a class that extends Thread.
2) Every object of such a class is a custom thread.
3) Every custom thread is in an "inactive" state by default.
4) Such a thread must be activated "only once" by calling "start" on it.
5) An active thread executes "run()" method in parallel.
6) A sub-class of Thread inherits a run method with an empty definition.
7) To assign a task to the active thread, one must override the run method and define the task in it.
*/


class MyThread extends Thread
{
 public void run()
 {
   int i; 
   for(i =0 ; i< 500; i++)
    System.out.print(" - ");
 }
 
 public static void main(String args[])
 {
  MyThread mt = new MyThread();// a user defined inactive thread.
  mt.start();//activate the thread
  System.out.println("Number of Active Threads : " + Thread.activeCount());        
 
  int i; 
  for(i =0 ; i< 500; i++)
    System.out.print(" | ");
 

 }//main
}