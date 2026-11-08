# JAVA_09_03. Своё исключение — Тесты

## Компиляция

```bash
javac -encoding UTF-8 Main.java
java Main
```

Эталон:

```bash
javac -encoding UTF-8 Solution.java && java Solution
javac -encoding UTF-8 SolutionCommented.java && java SolutionCommented
```

> В каждом файле свои классы `Account` и исключение — собирайте по одному.

## Проверка вывода

| Вход | Результат | Пояснение |
| --- | --- | --- |
| `100 40` | `Balance: 60\n` | Списание успешно |
| `50 50` | `Balance: 0\n` | Ровно хватает |
| `30 100` | `Error: insufficient funds\n` | Исключение перехвачено |
| `0 1` | `Error: insufficient funds\n` | Пустой счёт |

## Крайние случаи

- **Баланс равен сумме** — списание разрешено, остаток 0.
- **Сумма больше баланса** — исключение.
- **Нулевой баланс** — любе положительное списание не проходит.
- **Сообщение** — должно быть ровно `insufficient funds`.

## Автотесты

```bash
bash run_tests9_3.sh
```
