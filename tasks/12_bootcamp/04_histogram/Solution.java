import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> counts = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            counts.put(value, counts.getOrDefault(value, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            StringBuilder bar = new StringBuilder();
            for (int i = 0; i < entry.getValue(); i++) {
                bar.append('#');
            }
            System.out.println(entry.getKey() + ": " + bar);
        }
    }
}
