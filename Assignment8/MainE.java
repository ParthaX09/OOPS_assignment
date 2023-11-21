abstract class Shape 
{
    public abstract void printArea(int l, int w);
}

class Rectangle extends Shape 
{
    @Override
    public void printArea(int l, int w)
    {
        int area = l * w;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape 
{
    @Override
    public void printArea(int l, int w) 
    {
        double area = 0.5 * l * w;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape 
{
    @Override
    public void printArea(int l, int w) 
    {
        double area = 3.142 * l * w;
        System.out.println("Area of Circle: " + area);
    }
}

public class MainE 
{
    public static void main(String[] args) 
    {
        Shape ob;
        ob = new Rectangle();
        ob.printArea(4, 5);
        
        ob = new Triangle();
        ob.printArea(3, 6);
        
        ob = new Circle();
        ob.printArea(4,4);
    }
}
