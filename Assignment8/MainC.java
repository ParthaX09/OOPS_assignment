abstract class TwoDFigure 
{
    double dimension1;
    double dimension2;

    public TwoDFigure(double d1, double d2)
    {
        dimension1 = d1;
        dimension2 = d2;
    }

    public abstract double calculateArea();
}

class Rectangle extends TwoDFigure {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double calculateArea() {
        return dimension1 * dimension2;
    }
}

class Triangle extends TwoDFigure {
    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double calculateArea() {
        return 0.5 * dimension1 * dimension2;
    }
}

public class assg8c {
    public static void main(String[] args) {
        TwoDFigure rectangle = new Rectangle(5, 4);
        TwoDFigure triangle = new Triangle(6, 8);

        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
