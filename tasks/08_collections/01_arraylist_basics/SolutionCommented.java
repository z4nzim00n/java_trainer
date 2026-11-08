import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // List — интерфейс, ArrayList — конкретная реализация.
        // В дженерике указывается обёртка Integer, а не примитив int.
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // Автоупаковка: int автоматически превращается в Integer.
            list.add(sc.nextInt());
        }
        // size() — метод, в отличие от поля length у массива.
        System.out.println(list.size());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(' ');
            }
            // get(i) возвращает Integer, при сложении распаковывается в int.
            sb.append(list.get(i));
        }
        System.out.println(sb);
        // for-each по коллекции.
        int sum = 0;
        for (int value : list) {
            sum += value;
        }
        System.out.println(sum);
    }
}
