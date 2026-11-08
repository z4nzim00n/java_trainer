import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        // String неизменяем, поэтому reverse() есть только у StringBuilder.
        // 1. Создаём изменяемую копию строки.
        // 2. reverse() переворачивает буфер.
        // 3. toString() возвращает обычную строку.
        String reversed = new StringBuilder(line).reverse().toString();
        System.out.println(reversed);
    }
}
