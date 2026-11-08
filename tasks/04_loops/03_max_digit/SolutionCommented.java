import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Цифры лежат в диапазоне 0..9, поэтому 0 — безопасное начальное
        // значение максимума (оно не больше любой настоящей цифры).
        int max = 0;
        while (n > 0) {
            // Последняя цифра числа.
            int digit = n % 10;
            if (digit > max) {
                max = digit;
            }
            // Отбрасываем разобранную цифру.
            n /= 10;
        }
        // Для n = 0 цикл не выполнится, ответ останется 0.
        System.out.println(max);
    }
}
