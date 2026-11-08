import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuilder clean = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            // Оставляем только буквы и цифры, приводя буквы
            // к нижнему регистру: регистр не должен влиять на ответ.
            if (Character.isLetterOrDigit(c)) {
                clean.append(Character.toLowerCase(c));
            }
        }
        String s = clean.toString();
        // Строки сравниваются через equals, а не == :
        // == сравнивает ссылки, equals — содержимое.
        // new StringBuilder(s).reverse() даёт развёрнутую копию.
        boolean palindrome = s.equals(new StringBuilder(s).reverse().toString());
        System.out.println(palindrome);
    }
}
