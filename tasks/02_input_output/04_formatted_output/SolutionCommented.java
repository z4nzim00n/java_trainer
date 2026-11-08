import java.util.Locale;
import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ввод с точкой (3.5), поэтому Scanner настраиваем на Locale.US.
        sc.useLocale(Locale.US);

        double price = sc.nextDouble();
        int count = sc.nextInt();

        // printf — форматированный вывод.
        // %.2f — вещественное число с двумя знаками после точки.
        // \n — перевод строки (printf его не добавляет сам).
        // Locale.US гарантирует точку, а не запятую.
        System.out.printf(Locale.US, "Total: %.2f\n", price * count);
    }
}