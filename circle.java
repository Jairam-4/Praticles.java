
import java.util.*;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);

        System.out.println("Area of the circle: " + c.area());
        System.out.println("Perimeter of the circle: " + c.perimeter());

        sc.close();
    }
}
