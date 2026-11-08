import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            words.add(sc.next());
        }
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // TODO: сначала по длине, при равенстве — по алфавиту
                return 0;
            }
        });
        System.out.println(String.join(" ", words));
    }
}
