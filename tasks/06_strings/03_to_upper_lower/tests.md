# JAVA_06_03. Верхний и нижний регистр — Тесты

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
| `Hello World` | `HELLO WORLD\nhello world\n` | Обе строки, каждая с `\n` |
| `java` | `JAVA\njava\n` | Уже нижний регистр |
| `ABC` | `ABC\nabc\n` | Уже верхний регистр |
| `Hello, World! 123` | `HELLO, WORLD! 123\nhello, world! 123\n` | Знаки и цифры не меняются |

## Крайние случаи

- **Смешанный регистр** — основной случай.
- **Уже в нужном регистре** — результат совпадает с исходной строкой.
- **Пробелы и знаки** — сохраняются без изменений.
- **Пустая строка** — обе строки пустые, вывод — два переноса.

## Автотесты

```bash
bash run_tests6_3.sh
```
