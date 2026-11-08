# JAVA_12_03. Статистика — Тесты

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
| `3` + `1 2 3` | `Min: 1.00\nMax: 3.00\nAvg: 2.00\n` |
| `2` + `-1 1` | `Min: -1.00\nMax: 1.00\nAvg: 0.00\n` |
| `1` + `2.5` | `Min: 2.50\nMax: 2.50\nAvg: 2.50\n` |
| `4` + `1 2 3 4` | `Min: 1.00\nMax: 4.00\nAvg: 2.50\n` |

## Крайние случаи

- **Один элемент** — все три величины совпадают.
- **Отрицательные числа** — проверяют инициализацию не нулём.
- **Дробные значения** — проверяют `Locale.US`.
- **Среднее с половиной** — округление до двух знаков.

## Автотесты

```bash
bash run_tests12_3.sh
```
