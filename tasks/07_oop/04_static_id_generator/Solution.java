import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            User user = new User(name);
            System.out.println(user.getId() + " " + user.getName());
        }
    }
}

class User {
    private static int nextId = 1;
    private int id;
    private String name;

    User(String name) {
        this.name = name;
        this.id = nextId++;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }
}
