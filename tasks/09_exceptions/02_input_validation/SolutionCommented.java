import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // trim() убирает пробелы по краям: parseInt их не игнорирует.
        String line = sc.nextLine().trim();
        try {
            // parseInt принимает только целые числа:
            // ни точек, ни букв, ни пустых строк.
            int value = Integer.parseInt(line);
            System.out.println(value);
        } catch (NumberFormatException e) {
            // Внешние данные проверяем на границе и дальше работаем
            // уже с корректным int.
            System.out.println("Invalid number");
        }
    }
}
