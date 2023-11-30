import java.util.Scanner;
class Mathexception  extends Exception
{
    Mathexception(String str)
    {
        System.out.println("Mathexception:" +str);
    }
} 
class OverflowException extends Mathexception
{
    OverflowException(String str)
    {
    super(str);
    System.out.println("OverflowException:" +str);
    } 
} 
class UnderflowException extends Mathexception
{
    UnderflowException(String str)
    {
    super(str);
    System.out.println("UnderflowException:" +str);
    } 
} 

class MainD
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a value:");
        int n=sc.nextInt();
        try
        {
            if(n>100)
            {
                try
                {
                    throw new OverflowException("the given number is greater than 100.");
                } 
                catch(OverflowException e1)
                {
                     throw e1;
                }
            }
            else  
            {
                try
                {
                    throw  new UnderflowException("the given number is less than 100.");
                } 
                catch(UnderflowException e2)
                {
                    throw e2;
                }
    
            }
        }  
        catch(Exception e)
        {
            System.out.println("Exception:" +e);
        }
   }
}
