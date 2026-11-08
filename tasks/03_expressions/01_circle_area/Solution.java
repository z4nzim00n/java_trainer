import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.printf(Locale.US, "%.2f\n", area);
    }
}