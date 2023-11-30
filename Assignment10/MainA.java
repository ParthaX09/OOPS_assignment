class A extends Thread
{
    public void run()
    {
        try
        {
            for(int i=1;i<=10;i++)
                System.out.println(i);
        }
        catch(Exception e)
        {
            System.out.println("Exception caught");
        
        } 
    } 
}

class B extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            try
            {
                if(i==6)
                    Thread.sleep(10000);
            } 
            catch(Exception e) 
            {
                System.out.println("Exception caught");
            }
        }
    }
}


class MainA
{
    public static void main(String args[])
    {
        A x=new  A();
        B y=new B();
        x.start();
        y.start(); 
    }
}
