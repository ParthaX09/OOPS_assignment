import java.util.Scanner;

class NonFibonacciCalculator 
{
    public void Fibo(int a, int b, int n) 
    {
        if (n > 0) 
        {
            int nextTerm = a + b;
            for (int i = b + 1; i < nextTerm; i++)
            {
                if (n <= 0) 
                    break; 
                
                System.out.print(i + " ");
                n--;
            }
            Fibo(b, nextTerm, n);
        }
    }
}


public class NonFibonacci 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of terms: ");
        int n = sc.nextInt();

        System.out.println("First " + n + " Non-Fibonacci terms:");
        NonFibonacciCalculator obj = new NonFibonacciCalculator();
        obj.Fibo(0, 1, n);
        
        sc.close();
    }
}
