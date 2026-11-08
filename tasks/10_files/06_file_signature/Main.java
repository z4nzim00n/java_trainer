import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] data = Files.readAllBytes(Paths.get(args[0]));
        String type = "UNKNOWN";
        // TODO: проверь сигнатуры PNG, PDF и ZIP с проверкой длины
        System.out.println(type);
    }
}
