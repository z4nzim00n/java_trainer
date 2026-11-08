# JAVA_08_02. Частоты слов через HashMap — Тесты

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
| `5` + `apple banana apple cherry banana` | `apple 2\nbanana 2\ncherry 1\n` | Алфавитный порядок |
| `1` + `x` | `x 1\n` | Одно слово |
| `4` + `b a b a` | `a 2\nb 2\n` | Сортировка ключей |
| `3` + `z z z` | `z 3\n` | Одно слово трижды |

## Крайние случаи

- **Одно уникальное слово** — одна строка.
- **Все слова разные** — каждое с частотой 1, по алфавиту.
- **Порядок ввода не совпадает с алфавитным** — проверяет сортировку.

## Автотесты

```bash
bash run_tests8_2.sh
```
