import java.util.Scanner;
public class MainC
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        int c=0;
        for(int i=2;i<Math.sqrt(n);i++)
            if(n%i==0)
                c++;
        
        if(c==0)
            System.out.println(n+" is prime number");
        else 
            System.out.println(n+" is not prime number");
        
    }
}