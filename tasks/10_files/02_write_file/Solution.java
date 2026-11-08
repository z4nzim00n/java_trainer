import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()) {
            sb.append(sc.nextLine());
            if (sc.hasNextLine()) {
                sb.append('\n');
            }
        }
        byte[] data = sb.toString().getBytes(StandardCharsets.UTF_8);
        Files.write(Paths.get(args[0]), data);
        System.out.println("Saved: " + data.length + " bytes");
    }
}
