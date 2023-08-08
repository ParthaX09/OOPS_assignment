import java.util.Scanner;
public class Main
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.:");
        int n=sc.nextInt();
        int sq=(int)Math.pow(n,2);
        int c=0,m=n;
        while(m>0)
        {
            c++;
            m/=10;
        }
        m=sq%(int)Math.pow(10,c);
        if(n==m)
            System.out.println(n+" is automorphic");
        else 
            System.out.println(n+" is not automorphic");
        
    }
}
