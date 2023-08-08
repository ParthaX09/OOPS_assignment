import java.util.Scanner;
public class MainB
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter coefficient of a quadratic equation ax^2+bx+c=0:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double d=Math.pow(b,2.0)-4.0*a*c;
        if(d>0)
        {
            double x1=(-b+Math.sqrt(d))/(2.0*a);
            double x2=(-b-Math.sqrt(d))/(2.0*a);
            System.out.println("Two distinct real roots exist:"+x1+" "+x2);
        }
        else if(d==0)
        {
            double x=-b/(2.0*a);
            System.out.println("There is one real root:"+x);
        }
        else    
            System.out.println("roots are imaginary");
        
    }
}
