import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // trim() убирает пробелы по краям, чтобы они не считались словами.
        String line = sc.nextLine().trim();
        // Пустая строка — особый случай: "".split("\\s+") вернул бы
        // массив из одного пустого элемента, то есть длину 1.
        if (line.isEmpty()) {
            System.out.println(0);
        } else {
            // "\\s+" — регулярное выражение «один или несколько пробельных
            // символов». Двойная косая черта нужна из-за экранирования в Java.
            System.out.println(line.split("\\s+").length);
        }
    }
}
