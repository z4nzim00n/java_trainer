import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nextLine() читает ВСЮ оставшуюся строку до \n, включая пробелы.
        // next() прочитал бы только одно слово — это главная разница.
        String line = sc.nextLine();

        System.out.println(line);
    }
}