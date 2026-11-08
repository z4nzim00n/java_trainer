import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SolutionCommented {
    public static void main(String[] args) {
        try {
            // Путь приходит первым аргументом командной строки.
            // readAllBytes читает файл целиком в массив байтов.
            byte[] data = Files.readAllBytes(Paths.get(args[0]));
            // Байты -> строка в явной кодировке UTF-8.
            // print, а не println: содержимое выводится без лишнего \n.
            System.out.print(new String(data, StandardCharsets.UTF_8));
        } catch (IOException e) {
            System.out.println("Error: file not found");
        }
    }
}
