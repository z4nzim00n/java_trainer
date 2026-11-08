# JAVA_12_02. Кофемашина — Тесты

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
| `1` | `Cups: 2\nWater: 400 ml\nCoffee: 40 g\n` |
| `3` | `Cups: 6\nWater: 1200 ml\nCoffee: 120 g\n` |
| `0` | `Cups: 0\nWater: 0 ml\nCoffee: 0 g\n` |
| `5` | `Cups: 10\nWater: 2000 ml\nCoffee: 200 g\n` |

## Крайние случаи

- **Ноль человек** — все значения 0, строки всё равно выводятся.
- **Один человек** — две чашки.
- **Несколько человек** — пропорциональный рост.

## Автотесты

```bash
bash run_tests12_2.sh
```
