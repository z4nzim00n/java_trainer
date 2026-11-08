import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            if (command.equals("push")) {
                stack.push(sc.nextInt());
            } else if (command.equals("pop")) {
                // TODO: выведи верхний элемент (сняв его) или empty
            } else if (command.equals("peek")) {
                // TODO: выведи верхний элемент без снятия или empty
            } else if (command.equals("size")) {
                // TODO: выведи размер стека
            }
        }
    }
}
