import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int amount = sc.nextInt();
        Account account = new Account(balance);
        try {
            account.withdraw(amount);
            System.out.println("Balance: " + account.getBalance());
        } catch (InsufficientFundsException e) {
            // getMessage() возвращает строку, переданную в super(message).
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// Checked-исключение: наследник Exception. Компилятор требует,
// чтобы его либо обработали, либо объявили в throws.
class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
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

    // throws сообщает вызывающему, что операция может завершиться исключением.
    void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("insufficient funds");
        }
        balance -= amount;
    }
}
