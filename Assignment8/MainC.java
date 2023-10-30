abstract class Number 
{
    protected int value;

    public Number(int value) 
    {
        this.value = value;
    }

    public abstract void displayNum();
}

class HexNum extends Number 
{
    public HexNum(int value) 
    {
        super(value);
    }

    @Override
    public void displayNum() 
    {
        System.out.println("Hexadecimal: " + Integer.toHexString(value));
    }
}

class OctalNum extends Number 
{
    public OctalNum(int value) 
    {
        super(value);
    }

    @Override
    public void displayNum() 
    {
        System.out.println("Octal: " + Integer.toOctalString(value));
    }
}

public class MainC 
{
    public static void main(String[] args) 
    {
        Number num1 = new HexNum(255);  
        Number num2 = new OctalNum(63);  
        

        num1.displayNum();
        num2.displayNum();
    }
}
