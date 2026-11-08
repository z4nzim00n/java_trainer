import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Два независимых условия, объединённых логическим ИЛИ:
        //   n % 3 == 0  — остаток от деления на 3 равен нулю (делится нацело);
        //   n % 10 == 7 — последняя цифра числа равна 7.
        // Оператор || даёт true, если верно хотя бы одно из условий.
        // Сравнения выполняются раньше ||, поэтому скобки не обязательны,
        // но с ними читается яснее: (n % 3 == 0) || (n % 10 == 7).
        boolean special = n % 3 == 0 || n % 10 == 7;
        // println для boolean печатает "true" или "false" и добавляет перевод строки.
        System.out.println(special);
    }
}
