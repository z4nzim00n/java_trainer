import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String kind = sc.next();
        Shape shape;
        if (kind.equals("circle")) {
            shape = new Circle(sc.nextDouble());
        } else {
            shape = new Rectangle(sc.nextDouble(), sc.nextDouble());
        }
        System.out.printf(Locale.US, "%s: %.2f\n", kind, shape.area());
    }
}

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}
