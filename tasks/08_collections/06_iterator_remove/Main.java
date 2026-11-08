import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int value = it.next();
            // TODO: если value чётное, удали его через it.remove()
        }
        if (list.isEmpty()) {
            System.out.println("empty");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                if (i > 0) {
                    sb.append(' ');
                }
                sb.append(list.get(i));
            }
            System.out.println(sb);
        }
    }
}
