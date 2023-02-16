public class threadSleep extends Thread
{
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            try
            {
                Thread.sleep(500);
            }catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        threadSleep thread1=new threadSleep();
        threadSleep thread2=new threadSleep();
        thread1.start();
        thread2.start();
    }
}