# JAVA_06_01. Длина строки — Тесты

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
| `Hello` | `5\n` | Пять символов |
| `Hello, World!` | `13\n` | Пробел и знаки тоже считаются |
| `` (пустая строка) | `0\n` | Пустая строка имеет длину 0 |
| `a b` | `3\n` | `next()` дал бы 1 — нужен `nextLine()` |

## Крайние случаи

- **Пустая строка** — ответ `0`, а не ошибка.
- **Пробелы внутри** — считаются как обычные символы.
- **Строка из пробелов** — `nextLine()` не обрезает пробелы, длина равна их количеству.

## Автотесты

```bash
bash run_tests6_1.sh
```
