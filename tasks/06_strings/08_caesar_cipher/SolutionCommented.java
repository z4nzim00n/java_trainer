import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int shift = sc.nextInt();
        // nextInt не забирает перевод строки после числа.
        // Без этого nextLine() вернул бы пустую строку.
        sc.nextLine();
        String text = sc.nextLine();
        // Нормализуем сдвиг: даже при 26 или больше он останется в 0..25.
        int k = ((shift % 26) + 26) % 26;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                // Позиция в алфавите 0..25, сдвиг с заворотом по модулю 26,
                // обратное приведение int -> char.
                sb.append((char) ('a' + (c - 'a' + k) % 26));
            } else if (c >= 'A' && c <= 'Z') {
                sb.append((char) ('A' + (c - 'A' + k) % 26));
            } else {
                // Цифры, пробелы, пунктуация не шифруются.
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
