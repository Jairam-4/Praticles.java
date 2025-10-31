abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r; }
    double area() { return Math.PI * r * r; }
    double perimeter() { return 2 * Math.PI * r; }
}

class Rectangle extends Shape {
    double l, w;
    Rectangle(double l, double w) { this.l = l; this.w = w; }
    double area() { return l * w; }
    double perimeter() { return 2 * (l + w); }
}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(7);
        Shape s2 = new Rectangle(5, 3);
        System.out.println("Circle area: " + s1.area());
        System.out.println("Circle perimeter: " + s1.perimeter());
        System.out.println("Rectangle area: " + s2.area());
        System.out.println("Rectangle perimeter: " + s2.perimeter());
    }
}
