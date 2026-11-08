import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int n = sc.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
        double min = a[0];
        double max = a[0];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
            sum += a[i];
        }
        double avg = sum / n;
        System.out.printf(Locale.US, "Min: %.2f\n", min);
        System.out.printf(Locale.US, "Max: %.2f\n", max);
        System.out.printf(Locale.US, "Avg: %.2f\n", avg);
    }
}
