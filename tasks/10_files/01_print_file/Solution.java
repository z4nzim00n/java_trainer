import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) {
        try {
            byte[] data = Files.readAllBytes(Paths.get(args[0]));
            System.out.print(new String(data, StandardCharsets.UTF_8));
        } catch (IOException e) {
            System.out.println("Error: file not found");
        }
    }
}
