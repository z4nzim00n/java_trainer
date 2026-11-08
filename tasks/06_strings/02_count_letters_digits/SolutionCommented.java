import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int letters = 0;
        int digits = 0;
        // Перебираем индексы от 0 до length() - 1.
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            // isLetter распознаёт буквы любой письменности, не только ASCII.
            if (Character.isLetter(c)) {
                letters++;
            // else if: цифра не может быть буквой, вторая проверка не нужна
            // для уже посчитанного символа.
            } else if (Character.isDigit(c)) {
                digits++;
            }
            // Остальные символы (пробелы, знаки) не считаются.
        }
        System.out.println(letters + " " + digits);
    }
}
