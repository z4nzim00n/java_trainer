// Locale нужен, чтобы среднее печаталось с точкой, а не с запятой.
import java.util.Locale;
// Scanner — класс для чтения из стандартного ввода.
import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        // Создаём сканер, привязанный к stdin.
        Scanner sc = new Scanner(System.in);
        // Фиксируем американскую локаль: десятичный разделитель — точка.
        sc.useLocale(Locale.US);
        // Первое число — размер массива. nextInt читает целое (локаль не важна).
        int n = sc.nextInt();
        // В Java массив создаётся оператором new. Размер задаётся один раз.
        // Аналог в C: int a[n]; но в Java массив — объект, знает свою длину.
        int[] a = new int[n];
        // Заполняем массив: индексы от 0 до n-1 (как в C).
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Накопитель суммы. Начинаем с нуля.
        int sum = 0;
        // Проходим по всем элементам и прибавляем каждый к сумме.
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        // ВАЖНО: (double) sum — приведение к double ДО деления.
        // Без него sum / n было бы целочисленным (6 / 4 = 1, а не 1.5).
        double avg = (double) sum / n;
        // Сумма — целое, печатаем как есть, с переносом строки.
        System.out.println(sum);
        // Среднее — ровно два знака после точки и перенос строки.
        System.out.printf(Locale.US, "%.2f\n", avg);
    }
}