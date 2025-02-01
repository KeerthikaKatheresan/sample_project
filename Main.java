
abstract class Shape{
    abstract double calculateArea();
}

class Circle extends Shape{
    private double radius;

    public Circle(double rd)
    {
        this.radius=rd;
    }

    @Override
    double calculateArea()
    {
        return 2.14*radius*radius;
    }
}

class Rectangle extends Shape{
    private double length;
    private double breath;

    public Rectangle(double l,double b)
    {
        this.length=l;
        this.breath=b;
    }
    @Override
    double calculateArea()
    {
        return length*breath;
    }
}

class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double b,double h)
    {
        this.base=b;
        this.height=h;
    }
    @Override
    double calculateArea()
    {
        return 0.5*base*height;
    }
}

public class Main{
public static void main(String[] args)
{
    Shape c1=new Circle(20);
    Shape r1=new Rectangle(12,10);
    Shape t1=new Triangle(2,3);

    System.out.println("Area of circle="+c1.calculateArea());
    System.out.println("Area of rectangle="+r1.calculateArea());
    System.out.println("Area of triangle="+t1.calculateArea());


}
}