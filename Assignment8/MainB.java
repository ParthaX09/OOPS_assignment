abstract class Number 
{
    public abstract void displayNum(int value);
}

class HexNum extends Number 
{
    @Override
    public void displayNum(int value) 
    {
        char arr[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String s="";
        while(value > 0)
        {
            s =  arr[value%16] + s;
            value/=16;
        }
        System.out.println("Hexadecimal: " + s);

    }
}

class OctalNum extends Number 
{
    @Override
    public void displayNum(int value) 
    {
        char arr[] = {'0','1','2','3','4','5','6','7'};
        String s="";
        while(value > 0)
        {
            s =  arr[value%8] + s;
            value/=8;
        }
        System.out.println("Hexadecimal: " + s);

    }
}

public class MainB 
{
    public static void main(String[] args) 
    {
        Number ob;
        ob = new HexNum();
        ob.displayNum(10);
        
        ob = new OctalNum();
        ob.displayNum(8);
    }
}
