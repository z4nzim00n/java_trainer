import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }

    // static: методу не нужен объект, он работает только с аргументом.
    static boolean isPrime(int n) {
        // 0 и 1 не являются простыми.
        if (n < 2) {
            return false;
        }
        // Достаточно делителей до корня из n.
        // (long) d * d защищает от переполнения int.
        for (int d = 2; (long) d * d <= n; d++) {
            if (n % d == 0) {
                // Нашли делитель — число составное.
                return false;
            }
        }
        return true;
    }
}
