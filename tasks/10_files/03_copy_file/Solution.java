import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Solution {
    public static void main(String[] args) {
        try {
            Files.copy(Paths.get(args[0]), Paths.get(args[1]),
                    StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copied");
        } catch (IOException e) {
            System.out.println("Error: file not found");
        }
    }
}
