import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int value = sc.nextInt();
            // TODO: если value больше max, обнови max
        }
        System.out.println(max);
    }
}
