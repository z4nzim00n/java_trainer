import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // trim() убирает пробелы в начале и конце.
        String line = sc.nextLine().trim();
        if (line.isEmpty()) {
            // Пустая строка: печатаем только перевод строки.
            System.out.println();
        } else {
            // "\\s+" — один или несколько пробельных символов.
            // Заменяем каждую такую группу на один обычный пробел.
            // replaceAll возвращает новую строку, исходная не меняется.
            System.out.println(line.replaceAll("\\s+", " "));
        }
    }
}
