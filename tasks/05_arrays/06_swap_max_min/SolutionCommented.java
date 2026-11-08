import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Запоминаем именно ИНДЕКСЫ экстремумов:
        // без них неизвестно, какие ячейки менять.
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            // Строгие сравнения: при повторах остаётся ПЕРВЫЙ экстремум.
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
            if (a[i] > a[maxIndex]) {
                maxIndex = i;
            }
        }
        // Обмен значений через временную переменную.
        // Если все элементы равны, индексы совпадают — обмен ничего не меняет.
        int tmp = a[minIndex];
        a[minIndex] = a[maxIndex];
        a[maxIndex] = tmp;
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
