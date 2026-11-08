import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Вызывается конструктор с двумя аргументами.
        Point p1 = new Point(x, y);
        // Вызывается конструктор без аргументов.
        Point p2 = new Point();
        System.out.println(p1.coords());
        System.out.println(p2.coords());
    }
}

class Point {
    int x;
    int y;

    // Делегирование основному конструктору. Вызов this(...) обязан
    // быть первой строкой конструктора.
    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        // this.x — поле объекта, x — параметр. Без this присваивание
        // x = x не изменило бы поле.
        this.x = x;
        this.y = y;
    }

    String coords() {
        // Конкатенация превращает int в строку.
        return x + " " + y;
    }
}
