# JAVA_06_07. Палиндром — Тесты

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
| `Level` | `true\n` | Регистр игнорируется |
| `A man a plan a canal Panama` | `true\n` | Пробелы игнорируются |
| `hello` | `false\n` | Не палиндром |
| `12321` | `true\n` | Цифры тоже сравниваются |
| `Hello, World!` | `false\n` | Знаки и регистр не спасают |

## Крайние случаи

- **Смешанный регистр** — приводится к нижнему.
- **Пробелы и пунктуация** — отбрасываются.
- **Только цифры** — `12321` — палиндром.
- **Пустая строка после фильтрации** (`!!!`) — формально `true`.

## Автотесты

```bash
bash run_tests6_7.sh
```
