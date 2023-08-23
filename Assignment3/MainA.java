import java.util.Scanner;
public class MainA
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three nos:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int x;
        if(a>b && a>c)
            x=a;
        else if(b>a && b>c)
            x=b;
        else 
            x=c;
        //int max=(a>b && a>c)?a:(b>c)?b:c;
        
        System.out.println("Greatest number:"+x);
        
    }
}
