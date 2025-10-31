interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double r;
    Circle(double r) { this.r = r; }
    public double area() { return Math.PI * r * r; }
    public double perimeter() { return 2 * Math.PI * r; }
}

class Rectangle implements Shape {
    double l, w;
    Rectangle(double l, double w) { this.l = l; this.w = w; }
    public double area() { return l * w; }
    public double perimeter() { return 2 * (l + w); }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(10, 4);
        System.out.println("Circle area: " + c.area());
        System.out.println("Circle perimeter: " + c.perimeter());
        System.out.println("Rectangle area: " + r.area());
        System.out.println("Rectangle perimeter: " + r.perimeter());
    }
}
