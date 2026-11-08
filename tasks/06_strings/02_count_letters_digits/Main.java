import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int letters = 0;
        int digits = 0;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            // TODO: если c — буква, увеличь letters
            // TODO: иначе если c — цифра, увеличь digits
        }
        System.out.println(letters + " " + digits);
    }
}
