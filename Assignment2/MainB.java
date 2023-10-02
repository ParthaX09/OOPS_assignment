import java.util.Scanner;
public class MainB
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the basic pay:");
        int basic=sc.nextInt();
        double agp=basic*0.50;
        double da=0.50*(basic+agp);
        double hra=0.15*(basic+agp);
        double tsa=basic+agp+da+hra;
        System.out.println("Total salary:"+tsa);
        
    }
}
