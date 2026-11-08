## JAVA_09_03. Своё исключение

### Задание
| Java_09_03 ||
| ------ | ------- |
| **Темы:** | Собственный класс исключения, `throws`, `throw`, checked-исключения. |
| **Файл решения:** | Main.java |
| **Входные данные** | Стандартный поток ввода (stdin) |
| **Выходные данные** | Стандартный поток вывода (stdout) |

Опиши в файле `Main.java`:

1. **package-private** исключение `InsufficientFundsException extends Exception` с конструктором, принимающим сообщение и передающим его в `super(message)`.
2. **package-private** класс `Account` с полем `int balance`, конструктором `Account(int balance)`, методом `int getBalance()` и методом

```java
void withdraw(int amount) throws InsufficientFundsException
```

который списывает `amount`, если денег достаточно, иначе выбрасывает `InsufficientFundsException`.

В `main` считай баланс и сумму списания, выполни списание и выведи:

- при успехе — `Balance: <новый баланс>`;
- при ошибке — `Error: insufficient funds`.

```java
try {
    account.withdraw(amount);
    System.out.println("Balance: " + account.getBalance());
} catch (InsufficientFundsException e) {
    System.out.println("Error: " + e.getMessage());
}
```

### Примеры

| Входные данные | Результат работы |
| ------ | ------ |
| 100 40 | Balance: 60 |
| 50 50 | Balance: 0 |
| 30 100 | Error: insufficient funds |

### Как проверить

```bash
bash run_tests9_3.sh
```
