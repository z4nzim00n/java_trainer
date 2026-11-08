import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        // Пока в числе остались цифры:
        while (n > 0) {
            // n % 10 — последняя цифра (остаток от деления на 10).
            sum += n % 10;
            // n / 10 — целочисленное деление: отбрасывает последнюю цифру.
            n /= 10;
        }
        // Для n = 0 цикл не выполнится, sum останется 0 — это верный ответ.
        System.out.println(sum);
    }
}
