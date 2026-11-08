import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner file = new Scanner(Paths.get(args[0]), "UTF-8");
        long sum = 0;
        while (file.hasNextInt()) {
            sum += file.nextInt();
        }
        System.out.println(sum);
    }
}
