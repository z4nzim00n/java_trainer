import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Два указателя: начало и конец массива.
        int left = 0;
        int right = n - 1;
        while (left < right) {
            // Обмен через временную переменную: без неё первое
            // присваивание затёрло бы значение.
            int tmp = a[left];
            a[left] = a[right];
            a[right] = tmp;
            // Двигаемся к середине.
            left++;
            right--;
        }
        // Собираем строку без лишнего пробела в конце.
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
