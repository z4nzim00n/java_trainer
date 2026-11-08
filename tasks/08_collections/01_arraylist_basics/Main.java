import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // TODO: добавь прочитанное число в list
        }
        System.out.println(list.size());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(list.get(i));
        }
        System.out.println(sb);
        int sum = 0;
        for (int value : list) {
            sum += value;
        }
        System.out.println(sum);
    }
}
