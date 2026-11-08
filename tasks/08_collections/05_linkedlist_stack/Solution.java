import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            if (command.equals("push")) {
                stack.push(sc.nextInt());
            } else if (command.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println("empty");
                } else {
                    System.out.println(stack.pop());
                }
            } else if (command.equals("peek")) {
                if (stack.isEmpty()) {
                    System.out.println("empty");
                } else {
                    System.out.println(stack.peek());
                }
            } else if (command.equals("size")) {
                System.out.println(stack.size());
            }
        }
    }
}
