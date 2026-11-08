# JAVA_11_02. Два потока — Тесты

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
| `10` | `even: 30\nodd: 25\n` | 2+4+6+8+10 и 1+3+5+7+9 |
| `1` | `even: 0\nodd: 1\n` | Чётных нет |
| `5` | `even: 6\nodd: 9\n` | 2+4 и 1+3+5 |
| `2` | `even: 2\nodd: 1\n` | Минимальный случай с чётным |

## Крайние случаи

- **N = 1** — сумма чётных равна 0.
- **Чётное и нечётное N** — верхняя граница включается по-разному.
- **Большое N** — `long` обязателен.

## Автотесты

```bash
bash run_tests11_2.sh
```
