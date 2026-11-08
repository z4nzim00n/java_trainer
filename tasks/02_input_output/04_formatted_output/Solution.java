import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double price = sc.nextDouble();
        int count = sc.nextInt();
        System.out.printf(Locale.US, "Total: %.2f\n", price * count);
    }
}