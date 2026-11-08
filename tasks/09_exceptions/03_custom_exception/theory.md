# Разбор задания

## Зачем своё исключение

Стандартные исключения описывают технические ошибки (`ArithmeticException`, `NullPointerException`). Бизнес-ситуацию «не хватает денег» понятнее выразить отдельным типом: его можно поймать точечно и в сообщении объяснить причину.

## Checked и unchecked

| | Checked | Unchecked |
| --- | --- | --- |
| Предки | `Exception` (кроме `RuntimeException`) | `RuntimeException` |
| Компилятор требует обработки | да | нет |
| Примеры | `IOException`, `SQLException` | `NullPointerException`, `ArithmeticException` |

`InsufficientFundsException extends Exception` — checked: метод, который может его выбросить, обязан объявить `throws`, а вызывающий — обработать `try`/`catch` или пробросить дальше.

## Объявление throws

```java
void withdraw(int amount) throws InsufficientFundsException {
    if (amount > balance) {
        throw new InsufficientFundsException("insufficient funds");
    }
    balance -= amount;
}
```

`throws` в сигнатуре — предупреждение вызывающему. `throw` — фактический выброс объекта исключения.

## Сообщение

Конструктор:

```java
class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}
```

`getMessage()` вернёт строку, переданную в `super`. В `main` выводим `"Error: " + e.getMessage()` → `Error: insufficient funds`.

## Альтернатива: unchecked

Если унаследовать от `RuntimeException`, `throws` не обязателен. Для бизнес-ошибки, которую ожидают и обрабатывают, чаще выбирают checked; для ошибок программиста — unchecked.

## Частые ошибки

| Ошибка | Что происходит |
| --- | --- |
| `extends Throwable` | Слишком низко в иерархии, обычно не нужно |
| Нет `super(message)` | `getMessage()` вернёт `null` |
| Забыть `throws` в методе | Ошибка компиляции для checked-исключения |
| `throw e;` вместо `throw new ...` | Нет объекта `e` |
| `extends RuntimeException` | Checked-контракт не проверяется, задание требует `Exception` |
