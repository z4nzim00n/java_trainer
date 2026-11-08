import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int balance = sc.nextInt();
        User user = new User(name, balance);
        System.out.println(user.getName() + ": " + user.getBalance());
        int newBalance = sc.nextInt();
        user.setBalance(newBalance);
        if (newBalance >= 0) {
            System.out.println(user.getName() + ": " + user.getBalance());
        } else {
            System.out.println("Invalid balance");
        }
    }
}

class User {
    private String name;
    private int balance;

    User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    String getName() {
        return name;
    }

    int getBalance() {
        return balance;
    }

    void setBalance(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }
}