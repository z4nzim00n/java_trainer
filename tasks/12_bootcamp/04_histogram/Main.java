import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> counts = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            // TODO: увеличь счётчик значения в counts
        }
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            StringBuilder bar = new StringBuilder();
            // TODO: добавь '#' столько раз, сколько встретилось значение
            System.out.println(entry.getKey() + ": " + bar);
        }
    }
}
