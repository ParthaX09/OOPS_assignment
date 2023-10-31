abstract class Shape 
{
    protected int length;
    protected int width;

    public Shape(int length, int width) 
    {
        this.length = length;
        this.width = width;
    }

    public abstract void printArea();
}

class Rectangle extends Shape 
{
    public Rectangle(int length, int width) 
    {
        super(length, width);
    }

    @Override
    public void printArea() 
    {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape 
{
    public Triangle(int length, int width) 
    {
        super(length, width);
    }

    @Override
    public void printArea() 
    {
        double area = 0.5 * length * width;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape 
{
    public Circle(int radius) 
    {
        super(radius, 0);
    }

    @Override
    public void printArea() 
    {
        double area = Math.PI * length * length;
        System.out.println("Area of Circle: " + area);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Shape rectangle = new Rectangle(4, 5);
        Shape triangle = new Triangle(3, 6);
        Shape circle = new Circle(4);

        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
