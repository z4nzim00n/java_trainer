import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Сдвиг на N возвращает массив в исходное состояние,
        // поэтому достаточно остатка от деления.
        int shift = k % n;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                sb.append(' ');
            }
            // На позицию i приходит элемент, стоявший на shift позиций правее.
            // Остаток заворачивает индекс в диапазон 0..n-1.
            sb.append(a[(i + shift) % n]);
        }
        System.out.println(sb);
    }
}
