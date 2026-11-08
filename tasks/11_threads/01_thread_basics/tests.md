# JAVA_11_01. Первый поток — Тесты

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

## Проверка вывода

| Вход | Результат | Пояснение |
| --- | --- | --- |
| `100` | `5050\n` | Сумма 1..100 |
| `1` | `1\n` | Один элемент |
| `10` | `55\n` | Сумма 1..10 |
| `1000000` | `500000500000\n` | Нужен `long` |

## Крайние случаи

- **N = 1** — цикл выполняется один раз.
- **Большое N** — сумма не помещается в `int`.
- **Порядок вывода** — результат один, конкуренции за вывод нет.

## Автотесты

```bash
bash run_tests11_1.sh
```
