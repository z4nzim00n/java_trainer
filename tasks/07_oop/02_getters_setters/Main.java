import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: считай имя и начальный баланс, создай User,
        // выведи "<name>: <balance>" через геттеры
        // TODO: считай новый баланс, вызови setBalance,
        // выведи "<name>: <newBalance>" или "Invalid balance"
    }
}

class User {
    private String name;
    private int balance;

    User(String name, int balance) {
        // TODO: сохрани параметры в полях (this.name = name; ...)
    }

    String getName() {
        // TODO: верни имя
        return null;
    }

    int getBalance() {
        // TODO: верни баланс
        return 0;
    }

    void setBalance(int balance) {
        // TODO: присвой новый баланс, только если он >= 0
    }
}