import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            words.add(sc.next());
        }
        // Comparator задаёт собственный порядок сравнения.
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Отрицательное значение: a раньше b.
                if (a.length() != b.length()) {
                    return a.length() - b.length();
                }
                // При равной длине — лексикографический порядок.
                return a.compareTo(b);
            }
        });
        // String.join склеивает элементы через пробел без лишнего пробела.
        System.out.println(String.join(" ", words));
    }
}
