import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        // Обход с возможностью удаления: итератор знает об изменениях.
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int value = it.next();
            // it.remove() удаляет элемент, который вернул последний next().
            // Удалять через list.remove() во время обхода нельзя:
            // будет ConcurrentModificationException.
            if (value % 2 == 0) {
                it.remove();
            }
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
