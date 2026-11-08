import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuilder clean = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            // TODO: если c — буква или цифра, добавь её в нижнем регистре
        }
        String s = clean.toString();
        // TODO: сравни s с её разворотом через equals и выведи boolean
        System.out.println(false);
    }
}
