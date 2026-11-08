import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SolutionCommented {
    public static void main(String[] args) throws IOException {
        // readAllLines возвращает строки без символов перевода строки.
        List<String> lines = Files.readAllLines(Paths.get(args[0]), StandardCharsets.UTF_8);
        int count = 0;
        for (String line : lines) {
            // Убираем пробелы по краям.
            line = line.trim();
            // Пустую строку пропускаем: split дал бы длину 1.
            if (!line.isEmpty()) {
                // \\s+ — один или несколько пробельных символов.
                count += line.split("\\s+").length;
            }
        }
        System.out.println(count);
    }
}
