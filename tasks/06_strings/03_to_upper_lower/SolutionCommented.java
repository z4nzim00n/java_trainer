import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        // toUpperCase возвращает НОВУЮ строку: исходная line не меняется.
        System.out.println(line.toUpperCase());
        // То же самое для нижнего регистра.
        System.out.println(line.toLowerCase());
    }
}
