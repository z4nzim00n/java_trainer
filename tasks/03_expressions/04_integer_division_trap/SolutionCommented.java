// Импорт Locale фиксирует точку как десятичный разделитель.
import java.util.Locale;
import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Ключевой момент: делим на 2.0, а не на 2.
        // Делитель-литерал 2.0 имеет тип double, поэтому всё выражение
        // (a + b) / 2.0 вычисляется как вещественное деление.
        // С int-делителем (a + b) / 2 дробная часть была бы отброшена.
        double avg = (a + b) / 2.0;
        // %.2f — ровно два знака после точки, \n — конец строки.
        System.out.printf(Locale.US, "%.2f\n", avg);
    }
}
