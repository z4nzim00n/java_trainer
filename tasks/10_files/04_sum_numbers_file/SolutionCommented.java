import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Paths;

public class SolutionCommented {
    public static void main(String[] args) throws IOException {
        // Scanner работает не только с System.in, но и с файлом.
        // Второй параметр — кодировка.
        Scanner file = new Scanner(Paths.get(args[0]), "UTF-8");
        // long защищает от переполнения при большом количестве чисел.
        long sum = 0;
        // hasNextInt проверяет следующий токен, не считывая его.
        while (file.hasNextInt()) {
            sum += file.nextInt();
        }
        System.out.println(sum);
    }
}
