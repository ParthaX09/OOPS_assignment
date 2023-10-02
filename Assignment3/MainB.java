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
        double x1,x2;
        if(d>0)
        {
            x1=(-b+Math.sqrt(d))/(2.0*a);
            x2=(-b-Math.sqrt(d))/(2.0*a);
            System.out.println("Two distinct real roots exist:"+x1+" "+x2);
        }
        else if(d==0)
        {
            x1=-b/(2.0*a);
            System.out.println("There is one real root:"+x1);
        }
        else    
        {
            x1=-b/(2.0*a);
            x2=Math.sqrt(d*-1)/(2.0*a);
            System.out.println("The imaginary roots are: ("+x1+"+"+x2+"i)\tand\t"+"("+x1+"-"+x2+"i)");
        }

        sc.close();
    }
}
