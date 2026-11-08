import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Каждый вызов nextInt() читает одно число.
        // Разделитель (пробел или \n) Scanner пропускает сам.
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);
    }
}