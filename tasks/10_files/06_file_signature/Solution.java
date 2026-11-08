import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws IOException {
        byte[] data = Files.readAllBytes(Paths.get(args[0]));
        String type = "UNKNOWN";
        if (data.length >= 4
                && (data[0] & 0xFF) == 0x89
                && data[1] == 'P'
                && data[2] == 'N'
                && data[3] == 'G') {
            type = "PNG";
        } else if (data.length >= 4
                && data[0] == '%'
                && data[1] == 'P'
                && data[2] == 'D'
                && data[3] == 'F') {
            type = "PDF";
        } else if (data.length >= 4
                && data[0] == 'P'
                && data[1] == 'K'
                && data[2] == 0x03
                && data[3] == 0x04) {
            type = "ZIP";
        }
        System.out.println(type);
    }
}
