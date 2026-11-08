import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Deque + LinkedList — современная замена устаревшему Stack.
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            // Строки сравниваем через equals, а не ==.
            String command = sc.next();
            if (command.equals("push")) {
                // push кладёт значение на вершину; аргумент читаем сразу.
                stack.push(sc.nextInt());
            } else if (command.equals("pop")) {
                // pop на пустом стеке бросил бы исключение.
                if (stack.isEmpty()) {
                    System.out.println("empty");
                } else {
                    System.out.println(stack.pop());
                }
            } else if (command.equals("peek")) {
                if (stack.isEmpty()) {
                    System.out.println("empty");
                } else {
                    // peek смотрит на вершину, не снимая её.
                    System.out.println(stack.peek());
                }
            } else if (command.equals("size")) {
                System.out.println(stack.size());
            }
        }
    }
}
