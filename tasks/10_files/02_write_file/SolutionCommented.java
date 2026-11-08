import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        // Читаем stdin до конца. Перевод строки добавляем только МЕЖДУ
        // строками, поэтому в конце файла лишнего \n не будет.
        while (sc.hasNextLine()) {
            sb.append(sc.nextLine());
            if (sc.hasNextLine()) {
                sb.append('\n');
            }
        }
        // Строка -> байты в явной кодировке UTF-8.
        byte[] data = sb.toString().getBytes(StandardCharsets.UTF_8);
        // Files.write создаёт или перезаписывает файл.
        Files.write(Paths.get(args[0]), data);
        // length — поле массива: количество байтов.
        System.out.println("Saved: " + data.length + " bytes");
    }
}
