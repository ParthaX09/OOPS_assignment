import java.util.Scanner;
public class Main
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int f=0;
        for(int i=m;i<=n;i++)
        {
            int c=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    c++;
                    break;
                }
            } 
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
            if(a==1 && c==1)
            {
                System.out.println(i);
                f++;
            }
        }
        System.out.println("frequency:"+f);
    }
}
