import java.util.Scanner;

public class SolutionCommented {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // next() читает одно слово (имя без пробелов), nextInt() — целое.
        String name = sc.next();
        int balance = sc.nextInt();
        // Объект создаётся через конструктор: поля заполняются сразу.
        User user = new User(name, balance);
        // К приватным полям снаружи обращаемся ТОЛЬКО через геттеры.
        System.out.println(user.getName() + ": " + user.getBalance());
        int newBalance = sc.nextInt();
        // Сеттер сам решает, применять значение или нет:
        // отрицательный баланс он проигнорирует.
        user.setBalance(newBalance);
        if (newBalance >= 0) {
            // Баланс изменился — читаем новое значение через геттер.
            System.out.println(user.getName() + ": " + user.getBalance());
        } else {
            // Баланс остался прежним, сообщаем об ошибке (ASCII!).
            System.out.println("Invalid balance");
        }
    }
}

class User {
    // private: поле видно только внутри класса User.
    // Из Main напрямую user.balance = -100 написать нельзя —
    // компилятор запретит. Это и есть инкапсуляция.
    private String name;
    private int balance;

    // Конструктор: имя совпадает с именем класса, типа возврата нет.
    // this.name — поле объекта, name — параметр конструктора.
    User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    // Геттер: только читает поле, ничего не меняет.
    String getName() {
        return name;
    }

    int getBalance() {
        return balance;
    }

    // Сеттер с проверкой: некорректное значение не доходит до поля.
    // Параметр и поле называются одинаково, поэтому нужно this.balance.
    void setBalance(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }
}