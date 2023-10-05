import java.util.Scanner;

class NonFibonacciSeries 
{
    public void display(int n) 
    {
        int count = 0;
        int num = 1;

        while (count < n) {
            if (!isFibonacci(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    public boolean isFibonacci(int num) 
    {
        return isPerfectSquare(5 * num * num + 4) || isPerfectSquare(5 * num * num - 4);
    }

    public boolean isPerfectSquare(int x) 
    {
        int sqrt = (int) Math.sqrt(x);
        return sqrt * sqrt == x;
    }
}

public class NonFibonacci extends NonFibonacciSeries 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();

        NonFibonacci nf = new NonFibonacci();
        System.out.println("First " + n + " non-Fibonacci terms:");
        nf.display(n);
    }
}
