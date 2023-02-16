import java.io.*;
public class multithreading implements Runnable {

    private int x;
    private int y;
    private String operation;

    public multithreading(int x, int y, String operation) {
        this.x = x;
        this.y = y;
        this.operation = operation;
    }

    public void run() {
        if (operation.equals("add")) {
            System.out.println(x + " + " + y + " = " + (x + y));
        } else if (operation.equals("sub")) {
            System.out.println(x + " - " + y + " = " + (x - y));
        } else if (operation.equals("mul")) {
            System.out.println(x + " * " + y + " = " + (x * y));}
            else
            System.out.println(x + "/" + y + " = " +(x*y));

    }

    public static void main(String[] args) {
        multithreading addThread = new multithreading(5, 3, "add");
        multithreading subThread = new multithreading(5, 3, "sub");
        multithreading mulThread = new multithreading(5, 3, "mul");
        multithreading divThread = new multithreading(5,3,"div");
//try {
    Thread t1 = new Thread(addThread);
    Thread t2 = new Thread(subThread);
    Thread t3 = new Thread(mulThread);
    Thread t4 = new Thread(divThread);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

//    }
//catch(RuntimeException)
    }
}
