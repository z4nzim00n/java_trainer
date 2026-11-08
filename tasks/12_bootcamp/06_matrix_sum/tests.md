# JAVA_12_06. Матрица: сумма и максимум — Тесты

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

| Вход | Результат |
| --- | --- |
| `2 3` + `1 2 3 4 5 6` | `Sum: 21\nMax: 6\n` |
| `1 1` + `-5` | `Sum: -5\nMax: -5\n` |
| `2 2` + `0 0 0 0` | `Sum: 0\nMax: 0\n` |
| `2 3` + `-1 -2 -3 -4 -5 -6` | `Sum: -21\nMax: -1\n` |

## Крайние случаи

- **Матрица 1×1** — сумма и максимум равны единственному элементу.
- **Все нули** — максимум 0.
- **Все отрицательные** — ловит `max = 0`.
- **Максимум в любом месте** — проход по всем ячейкам.

## Автотесты

```bash
bash run_tests12_6.sh
```
