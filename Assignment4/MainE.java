import java.util.Scanner;
public class MainE
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int i=m;i<=n;i++)
        {
            int s=0,a=i;
            while(a>9)
            {
                int x=a;
                while(x>0)
                {
                    s+=x%10;
                    x/=10;
                }
                a=s;
                s=0;
            }
            if(a==1)
                System.out.println(i);
            
        }
    }
}
