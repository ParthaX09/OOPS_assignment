import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class MainH
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        int n = sc.nextInt(); 
        int mat[][] = new int[n][n];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
                mat[i][j] = sc.nextInt();
        }

        System.out.println("Original matrix:");
        for ( int row[]: mat)
        {
            for(int x: row)
                System.out.print(x+"\t");
            System.out.println();
        }
        
            
        int nonbound[] = new int[(n - 2) * (n - 2)];
        int index=0;

        for (int i = 1; i < n - 1; i++) 
        {
            for (int j = 1; j < n - 1; j++) 
                nonbound[index++] = mat[i][j];
            
        }

        for (int i = 0; i < index - 1; i++) 
        {
            for (int j = 0; j < index - i - 1; j++) 
                if (nonbound[j] > nonbound[j + 1]) 
                {
                    int temp = nonbound[j];
                    nonbound[j] = nonbound[j + 1];
                    nonbound[j + 1] = temp; 
                }
        }

        index = 0;
        for (int i = 1; i < n - 1; i++) 
        {
            for (int j = 1; j < n - 1; j++) 
                mat[i][j] = nonbound[index++];
        }

        System.out.println("Rearranged matrix:");
        for ( int row[]: mat)
        {
            for(int x: row)
                System.out.print(x+"\t");
            System.out.println();
        }

        int diag1=0, diag2=0;
        for (int i = 0; i < n; i++) 
        {
            diag1 += mat[i][i];
            diag2 += mat[i][n - i - 1];
        }


        System.out.println("Rearranged matrix:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
                if( i==j || i==n-1-j )
                    System.out.print(mat[i][j]+"\t");
                else 
                    System.out.print("\t");
            System.out.println();   
        }
        System.out.println("Sum of diagonal elements:"+(diag1+diag2));


        sc.close();   
    }
}
