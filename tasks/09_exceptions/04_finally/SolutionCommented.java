import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            // Обрабатываем только деление на ноль.
            System.out.println("Error: division by zero");
        } finally {
            // finally выполняется всегда: и при успехе, и при ошибке.
            System.out.println("Done");
        }
    }
}
