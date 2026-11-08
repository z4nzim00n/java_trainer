// Импорт Locale нужен, чтобы десятичным разделителем была точка, а не запятая.
import java.util.Locale;
// Импорт Scanner — класса для чтения из стандартного ввода.
import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        // Создаём "сканер", привязанный к стандартному вводу (stdin).
        Scanner sc = new Scanner(System.in);
        // На русской Windows Scanner по умолчанию ждёт запятую (3,5).
        // useLocale(Locale.US) заставляет читать и печатать числа с точкой (3.5).
        sc.useLocale(Locale.US);
        // nextDouble считывает одно вещественное число. Тип double — 64-битное
        // число с плавающей точкой (аналог double в C).
        double radius = sc.nextDouble();
        // Math.PI — готовая константа π = 3.141592653589793.
        // Умножение слева направо: (Math.PI * radius) * radius.
        double area = Math.PI * radius * radius;
        // printf печатает по формату: %.2f — число с ровно 2 знаками после точки
        // (с округлением), \n — перенос строки. Locale.US фиксирует точку и при печати.
        System.out.printf(Locale.US, "%.2f\n", area);
    }
}