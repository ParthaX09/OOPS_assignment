import java.util.Scanner;
public class MainC
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.:");
        int n=sc.nextInt();
        int m=n,s=0;
        while(m>0)
        {
            int f=1;
            int x=m%10;
            while(x>1)
                f*=x--;
            s+=f;
            f=1;
            m/=10;
        }
        if(s==n)
            System.out.println(n+" is special number");
        else
            System.out.println(n+" is not special number");
    }
}
