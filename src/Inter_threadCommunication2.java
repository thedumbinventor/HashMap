import java.util.Scanner;

public class Inter_threadCommunication2{
    Scanner scanner=new Scanner(System.in);

    public void thread1() throws InterruptedException
    {
        synchronized (this)
        {
            System.out.println("Thread 1 Started");
            wait();
            System.out.println("Thread 1 Resumed");

        }
    }
    public void thread2() throws InterruptedException{

            Thread.sleep(2000);

            synchronized (this){
            System.out.println("Waiting For R to be Pressed");
            if(scanner.next()=="R")
            {
                System.out.println("R Pressed");
            }
            notify();
            Thread.sleep(3000);
        }

    }
    public void thread3() throws InterruptedException{
     Thread.sleep(1000);
     synchronized (this){
         System.out.println("Waiting For thread 2 be completed");
         if(scanner.next()=="A")
         {
             System.out.println("A Pressed");
         }
         notify();
         Thread.sleep(3000);
          }


    }


}
