import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double radians = sc.nextDouble();
        double degrees = radians * 180 / Math.PI;
        System.out.printf(Locale.US, "%.2f\n", degrees);
    }
}