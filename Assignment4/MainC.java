import java.util.Scanner;
public class MainC
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int k=m;k<=n;k++)
        {
            int c=0;
            for(int i=2;i<k;i++)
                if(k%i==0)
                    c++;
            if(c==0 && k!=1)
                System.out.println(k);       
        }
        sc.close();
        
    }
}
