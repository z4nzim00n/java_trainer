import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int amount = sc.nextInt();
        Account account = new Account(balance);
        try {
            account.withdraw(amount);
            System.out.println("Balance: " + account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        // TODO: передай сообщение в конструктор Exception
    }
}

class Account {
    private int balance;

    Account(int balance) {
        this.balance = balance;
    }

    int getBalance() {
        return balance;
    }

    void withdraw(int amount) throws InsufficientFundsException {
        // TODO: если amount > balance, выброси InsufficientFundsException
        // TODO: иначе уменьши balance
    }
}
