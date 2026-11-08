import java.util.Locale;
import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // На русской Windows nextDouble() по умолчанию ждёт запятую (2,5).
        // Locale.US заставляет читать точку как разделитель: 2.5.
        sc.useLocale(Locale.US);
        // new создаёт объект в памяти и возвращает ссылку на него.
        // Все поля получают значения по умолчанию (для double это 0.0).
        Rectangle rect = new Rectangle();
        // Доступ к полям объекта — через точку, как к полям struct в C.
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();
        // Вызов метода объекта: rect.area() выполнится для конкретного rect.
        // Locale.US и здесь: printf("%f") без локали напечатал бы запятую.
        System.out.printf(Locale.US, "%.2f\n", rect.area());
        System.out.printf(Locale.US, "%.2f\n", rect.perimeter());
    }
}

// Вспомогательный класс — package-private (без public) и в том же файле.
// Публичным может быть только класс, совпадающий с именем файла.
class Rectangle {
    // Поля (состояние объекта). У каждого объекта свои копии полей.
    double width;
    double height;

    // Метод (поведение). Внутри метода поля width и height —
    // это поля ТОГО объекта, у которого вызвали метод.
    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }
}