import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nextLine() читает всю строку до конца, включая пробелы.
        // next() вернул бы только первое слово.
        String line = sc.nextLine();
        // length() — метод, в отличие от поля length у массивов.
        System.out.println(line.length());
    }
}
