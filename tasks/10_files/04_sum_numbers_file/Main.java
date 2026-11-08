import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner file = new Scanner(Paths.get(args[0]), "UTF-8");
        long sum = 0;
        while (file.hasNextInt()) {
            // TODO: добавь очередное число к sum
        }
        System.out.println(sum);
    }
}
