import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Rectangle rect = new Rectangle();
        // TODO: считай ширину и высоту в поля объекта:
        // rect.width = sc.nextDouble(); rect.height = sc.nextDouble();
        // TODO: выведи площадь и периметр на двух строках:
        // System.out.printf(Locale.US, "%.2f\n", rect.area());
    }
}

class Rectangle {
    double width;
    double height;

    double area() {
        // TODO: верни площадь прямоугольника (width * height)
        return 0;
    }

    double perimeter() {
        // TODO: верни периметр прямоугольника (2 * (width + height))
        return 0;
    }
}