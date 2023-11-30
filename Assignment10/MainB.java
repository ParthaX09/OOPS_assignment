class Operation 
{
    int a=6, b=4;
    void add()
    {
        int c=a, d=b;
        try 
        {
            Thread.sleep(500);
        } 
        catch(Exception e) 
        {
            e.printStackTrace();
        }
        System.out.println("a+b="+(c+d));
    }
    
    void increase()
    {
        a+=5;
        b+=5;
        try
        {
            Thread.sleep(500);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("a="+a+"\nb="+b);
    }
}

class A extends Thread
{
    Operation ob;
    A(Operation ob1)
    {
        ob = ob1;
    }
    public void run()
    {
        ob.add();
    }
}


class B extends Thread
{
    Operation ob;
    B(Operation ob1)
    {
        ob = ob1;
    }
    public void run()
    {
        ob.increase();
    }
}


public class MainB 
{
    public static void main(String[] args)
    {
        Operation ob = new Operation();
        A x = new A(ob);
        B y = new B(ob);
        x.start();
        y.start();
    }
}
