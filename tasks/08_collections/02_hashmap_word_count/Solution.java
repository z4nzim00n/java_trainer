import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> counts = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        List<String> keys = new ArrayList<>(counts.keySet());
        Collections.sort(keys);
        for (String key : keys) {
            System.out.println(key + " " + counts.get(key));
        }
    }
}
