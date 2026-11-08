# JAVA_09_02. Проверка ввода — Тесты

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
| `42` | `42\n` | Корректное число |
| `abc` | `Invalid number\n` | Буквы |
| `-7` | `-7\n` | Отрицательное число |
| `3.14` | `Invalid number\n` | Дробная точка не допускается |
| `` (пустая строка) | `Invalid number\n` | Пустую строку нельзя разобрать |

## Крайние случаи

- **Пустая строка** — `NumberFormatException`.
- **Пробелы по краям** — `trim()` спасает `" 42 "`.
- **Дробное число** — `parseInt` не подходит.
- **Слишком большое число** — не помещается в `int`.

## Автотесты

```bash
bash run_tests9_2.sh
```
