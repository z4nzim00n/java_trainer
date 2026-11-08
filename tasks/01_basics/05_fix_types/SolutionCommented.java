import java.util.Locale;
import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // На русской Windows Scanner ждёт запятую в дробных числах.
        // useLocale(Locale.US) заставляет его принимать точку — как в тестах.
        sc.useLocale(Locale.US);

        int a = sc.nextInt();

        // nextDouble() возвращает double. Нельзя положить его в int:
        // Java не выполняет неявное сужение типа.
        double b = sc.nextDouble();

        // boolean принимает только true/false. Число 1 — не boolean.
        boolean flag = true;

        // "x" — строка (String), 'x' — символ (char). Это разные типы.
        String s = "x";

        // int автоматически расширяется до double при сложении.
        System.out.println(a + b);
    }
}