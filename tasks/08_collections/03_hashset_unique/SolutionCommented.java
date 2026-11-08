import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Set хранит только уникальные значения: повторный add игнорируется.
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        // size() — количество уникальных.
        System.out.println(set.size());
        // HashSet не гарантирует порядок, поэтому копируем в список
        // и сортируем по возрастанию.
        List<Integer> sorted = new ArrayList<>(set);
        Collections.sort(sorted);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sorted.size(); i++) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(sorted.get(i));
        }
        System.out.println(sb);
    }
}
