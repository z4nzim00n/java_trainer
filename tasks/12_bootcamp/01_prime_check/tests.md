# JAVA_12_01. Проверка на простое число — Тесты

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
| `7` | `true\n` | Простое |
| `2` | `true\n` | Минимальное простое |
| `1` | `false\n` | Не простое |
| `9` | `false\n` | 3 · 3 |
| `97` | `true\n` | Простое |
| `4` | `false\n` | 2 · 2 |

## Крайние случаи

- **0 и 1** — не простые по определению.
- **2** — единственное чётное простое.
- **Квадрат простого** (`9`, `49`) — проверяет границу `d * d <= n`.
- **Большое простое** — проверяет производительность O(√N).

## Автотесты

```bash
bash run_tests12_1.sh
```
