import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double avg = (a + b) / 2.0;
        System.out.printf(Locale.US, "%.2f\n", avg);
    }
}
