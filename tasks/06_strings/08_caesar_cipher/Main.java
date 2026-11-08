import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int shift = sc.nextInt();
        sc.nextLine();
        String text = sc.nextLine();
        int k = ((shift % 26) + 26) % 26;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // TODO: сдвинь латинские буквы, сохранив регистр, с заворотом через 26
            // TODO: остальные символы добавь без изменений
        }
        System.out.println(sb);
    }
}
