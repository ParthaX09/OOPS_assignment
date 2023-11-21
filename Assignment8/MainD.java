abstract class GeometricObject {
    String color;
    double weight;

    public GeometricObject() {
        this.color = "White";
        this.weight = 1.0;
    }

    public String getColor() 
    {
        return color;
    }

    public double getWeight() 
    {
        return weight;
    }

    public abstract double findArea();
    public abstract double findCircumference();
}

class Triangle extends GeometricObject 
{
    double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) 
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double findArea() 
    {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    @Override
    public double findCircumference() {
        double circumference = side1 + side2 + side3;
        return circumference;
    }
}

public class MainD
{
    public static void main(String[] args) 
    {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Weight: " + triangle.getWeight());
        System.out.println("Area: " + triangle.findArea());
        System.out.println("Circumference: " + triangle.findCircumference());
    }
}
