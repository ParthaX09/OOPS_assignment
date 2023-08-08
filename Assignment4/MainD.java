import java.util.Scanner;
public class MainD
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.:");
        int n=sc.nextInt();
        int m=n,rev=0;
        while(m>0)
        {
            rev=rev*10 + m%10;
            m/=10;
        }
        if(rev==n)
            System.out.println(n+" is palindrome");
        else
            System.out.println(n+" is not palindrome");
        
    }
}
