import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Rectangle rect = new Rectangle();
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();
        System.out.printf(Locale.US, "%.2f\n", rect.area());
        System.out.printf(Locale.US, "%.2f\n", rect.perimeter());
    }
}

class Rectangle {
    double width;
    double height;

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }
}