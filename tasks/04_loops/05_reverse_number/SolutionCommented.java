import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Результат может не поместиться в int, поэтому long.
        long reversed = 0;
        while (n > 0) {
            // reversed * 10 сдвигает уже собранные цифры влево,
            // n % 10 добавляет последнюю цифру справа.
            reversed = reversed * 10 + n % 10;
            // Отбрасываем разобранную цифру.
            n /= 10;
        }
        // Для n = 0 цикл не выполнится, ответ 0.
        // Нули, пришедшие в начало, автоматически исчезают: это число.
        System.out.println(reversed);
    }
}
