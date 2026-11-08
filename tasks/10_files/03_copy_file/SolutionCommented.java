import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class SolutionCommented {
    public static void main(String[] args) {
        try {
            // args[0] — источник, args[1] — назначение.
            // REPLACE_EXISTING позволяет перезаписать существующий файл;
            // без этой опции повторный запуск упал бы с FileAlreadyExistsException.
            Files.copy(Paths.get(args[0]), Paths.get(args[1]),
                    StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copied");
        } catch (IOException e) {
            // FileNotFoundException/NoSuchFileException — подтипы IOException.
            System.out.println("Error: file not found");
        }
    }
}
