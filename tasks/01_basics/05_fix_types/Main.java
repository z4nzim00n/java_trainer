import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int a = sc.nextInt();
        int b = sc.nextDouble();
        boolean flag = 1;
        String s = 'x';
        System.out.println(a + b);
    }
}