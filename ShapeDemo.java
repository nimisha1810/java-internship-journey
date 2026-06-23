interface Shape{
    void calculateArea();
}
class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public void calculateArea(){
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle =" + area);
    }
}
class Rectangle implements Shape{
    double length, width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public void calculateArea(){
        double area = length * width;
        System.out.println("Area of Rectangle =" + area);
    }
}
public class ShapeDemo{
    public static void main(String[] args){
        Circle c = new Circle(5);
        c.calculateArea();

        Rectangle r = new Rectangle(4,6);
        r.calculateArea();
    }
}

