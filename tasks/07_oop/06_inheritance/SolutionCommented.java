import java.util.Locale;
import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String kind = sc.next();
        // Ссылка типа Shape хранит объект-наследник: это полиморфизм.
        Shape shape;
        if (kind.equals("circle")) {
            shape = new Circle(sc.nextDouble());
        } else {
            shape = new Rectangle(sc.nextDouble(), sc.nextDouble());
        }
        // Вызов area() диспетчеризуется по реальному типу объекта.
        System.out.printf(Locale.US, "%s: %.2f\n", kind, shape.area());
    }
}

// Абстрактный класс нельзя инстанцировать; метод объявлен без тела.
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Реализация абстрактного метода предка.
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
