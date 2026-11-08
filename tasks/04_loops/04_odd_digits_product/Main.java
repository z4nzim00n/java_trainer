import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long product = 1;
        boolean found = false;
        while (n > 0) {
            int digit = n % 10;
            // TODO: если digit нечётная, умножь product на неё и выставь found = true
            n /= 10;
        }
        // TODO: выведи product, если found, иначе 0
        System.out.println(found ? product : 0);
    }
}
