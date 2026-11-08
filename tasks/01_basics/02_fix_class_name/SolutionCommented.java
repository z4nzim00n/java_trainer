import java.util.Scanner;

// Ошибка 1 была здесь: public class main (с маленькой буквы).
// Имя публичного класса обязано совпадать с именем файла:
// файл SolutionCommented.java -> класс SolutionCommented.
// Java чувствительна к регистру: main и Main — разные имена.
public class SolutionCommented {
    // Ошибка 2 была здесь: public void main(String[] args) — без static.
    // JVM не создаёт объект класса перед запуском, поэтому точка входа
    // обязана быть статической: public static void main(String[] args).
    public static void main(String[] args) {
        // Scanner читает данные из стандартного ввода (System.in).
        Scanner sc = new Scanner(System.in);
        // nextInt считывает одно целое число, пропуская пробелы и переносы.
        int a = sc.nextInt();
        int b = sc.nextInt();
        // println печатает произведение и добавляет перенос строки.
        System.out.println(a * b);
    }
}