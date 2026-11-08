import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Начинаем с нуля: 0 ^ x = x.
        int result = 0;
        for (int i = 0; i < n; i++) {
            // Применяем XOR к очередному числу.
            // x ^ x = 0 — парные числа взаимно уничтожаются.
            // Порядок не важен: XOR коммутативен и ассоциативен.
            result ^= sc.nextInt();
        }
        // Осталось только число без пары.
        System.out.println(result);
    }
}
