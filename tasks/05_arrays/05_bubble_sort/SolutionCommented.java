import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Внешний цикл: после каждого прохода в конец встаёт очередной максимум.
        // Достаточно n - 1 проходов: последний элемент окажется на месте сам.
        for (int i = 0; i < n - 1; i++) {
            // Последние i элементов уже отсортированы, их не трогаем.
            for (int j = 0; j < n - 1 - i; j++) {
                // Строгое "больше": равные элементы не меняются местами,
                // поэтому сортировка остаётся устойчивой.
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(a[i]);
        }
        System.out.println(sb);
    }
}
