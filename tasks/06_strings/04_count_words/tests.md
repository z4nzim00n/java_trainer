# JAVA_06_04. Количество слов — Тесты

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
| `hello world` | `2\n` | Два слова |
| `one two three` | `3\n` | Три слова |
| `` (пустая строка) | `0\n` | Особый случай: `split` дал бы 1 |
| `  one   two  three ` | `3\n` | Лишние пробелы не создают слов |
| `solo` | `1\n` | Одно слово |

## Крайние случаи

- **Пустая строка** — ключевой тест: без проверки `isEmpty()` получится 1.
- **Несколько пробелов подряд** — проверяют `\\s+`.
- **Пробелы по краям** — их убирает `trim()`.
- **Строка из одних пробелов** — после `trim()` пустая, ответ 0.

## Автотесты

```bash
bash run_tests6_4.sh
```
