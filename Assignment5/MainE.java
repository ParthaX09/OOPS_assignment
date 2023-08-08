import java.util.Scanner;
public class Main
{
    public static void main (String[] args) 
    {
        boolean flag = true;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.");
        int n = sc.nextInt();
        int num = n;
        int c=0;
        while (num > 0)
        {
            int r = num % 10;
            c++;
            num/=10;
        }
        num = n;
        for (int i=1;i<=c;i++)
        {
            int r = num % 10;
            num = num / 10;
            num = (r * (int) Math.pow(10, c - 1)) + num;
            
            int x=0;
            for(int k=2;k<num;k++)
            {
                if(num%k==0)
                    x++;
            }
            if(x!=0)
            {
                flag = false;
                break;
            }
        }
        
        if(flag)
            System.out.println(n+" is Circular Prime");
        else
            System.out.println(n+" is Not Circular Prime");
        
    }
}
