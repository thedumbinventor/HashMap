import java.util.*;

public class Inter_threadCommunication {

    public static void main(String[] args) throws InterruptedException {

        Inter_threadCommunication2 threadObject = new Inter_threadCommunication2();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    threadObject.thread1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });



        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run() {
                try{
                threadObject.thread2();}

                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    threadObject.thread3();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }

            }
        });


        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
    }



}
