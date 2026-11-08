import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            // Если b == 0, JVM выбросит ArithmeticException
            // прямо на операции деления.
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            // Перехватываем только это конкретное исключение.
            // Ловить Exception целиком здесь было бы слишком широко.
            System.out.println("Error: division by zero");
        }
    }
}
