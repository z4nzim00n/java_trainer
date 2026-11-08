import java.util.Locale;
import java.util.Scanner;

public class Main {
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
        // TODO: пройди по массиву и обнови min, max, sum
        double avg = sum / n;
        System.out.printf(Locale.US, "Min: %.2f\n", min);
        System.out.printf(Locale.US, "Max: %.2f\n", max);
        System.out.printf(Locale.US, "Avg: %.2f\n", avg);
    }
}
