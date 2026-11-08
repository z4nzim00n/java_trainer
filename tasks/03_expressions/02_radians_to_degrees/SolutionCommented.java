// Locale нужен для десятичной точки вместо запятой на русской Windows.
import java.util.Locale;
// Scanner — класс для чтения из стандартного ввода.
import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        // Scanner привязываем к стандартному вводу (stdin).
        Scanner sc = new Scanner(System.in);
        // Читаем числа с точкой (3.5), а не с запятой (3,5).
        sc.useLocale(Locale.US);
        // Считываем угол в радианах. double — вещественный тип (как в C).
        double radians = sc.nextDouble();
        // Перевод радиан в градусы: π радиан = 180 градусов.
        // Порядок важен: сначала умножаем на 180, потом делим на π.
        // 180 — int, но в выражении с double он автоматически станет double.
        double degrees = radians * 180 / Math.PI;
        // %.2f — ровно два знака после точки с округлением, \n — перенос строки.
        System.out.printf(Locale.US, "%.2f\n", degrees);
    }
}