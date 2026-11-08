import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nextInt() читает число, но НЕ забирает \n после него.
        // В потоке остаётся перевод строки.
        int age = sc.nextInt();

        // Поэтому следующий nextLine() вернул бы пустую строку.
        // Пустой nextLine() "съедает" оставшийся \n.
        sc.nextLine();

        // Теперь nextLine() читает уже настоящую строку с именем.
        String name = sc.nextLine();

        System.out.println(name + ": " + age);
    }
}