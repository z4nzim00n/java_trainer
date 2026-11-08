import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Первое число читаем до цикла: оно гарантированно есть (n >= 1)
        // и служит начальным значением максимума. Инициализировать нулём
        // нельзя: последовательность может быть полностью отрицательной.
        int max = sc.nextInt();
        // Остались n - 1 чисел, поэтому счётчик начинается с 1.
        for (int i = 1; i < n; i++) {
            int value = sc.nextInt();
            // Строгое "больше": при равенстве максимум не меняется.
            if (value > max) {
                max = value;
            }
        }
        System.out.println(max);
    }
}
