import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Массив фиксированного размера; элементы заполняем в цикле.
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Первый элемент существует гарантированно (n >= 1) и служит
        // начальным значением сразу для минимума и максимума.
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        // Конкатенация: int автоматически превращается в строку.
        System.out.println(min + " " + max);
    }
}
