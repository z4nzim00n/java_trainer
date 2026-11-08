import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Нейтральный элемент умножения — 1, а не 0.
        // long, потому что произведение десяти девяток больше int.
        long product = 1;
        // Флаг: встретилась ли хоть одна нечётная цифра.
        boolean found = false;
        while (n > 0) {
            int digit = n % 10;
            // Нечётность: остаток от деления на 2 равен 1.
            if (digit % 2 == 1) {
                product *= digit;
                found = true;
            }
            n /= 10;
        }
        // Если нечётных цифр не было, по условию ответ 0, а не 1.
        System.out.println(found ? product : 0);
    }
}
