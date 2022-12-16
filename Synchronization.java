import java.util.Scanner;
class multiply
{
    void call(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " X " + num + " = " + (i * num));
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
class mtable extends Thread
{
    int n;
    multiply mul;
    Thread t;
    mtable(multiply m,int num)
    {
        mul=m;
        n=num;
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        synchronized (mul)
        {
            mul.call(n);
        }
    }
}
public class Synchronization
{
    public static void main(String[] args)
    {
        multiply mul=new multiply();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers to display multiplication table");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        mtable t1=new mtable(mul,a);
        mtable t2=new mtable(mul,b);
        mtable t3=new mtable(mul,c);
        try
        {
            t1.t.join();
            t2.t.join();
            t3.t.join();
        }
        catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
