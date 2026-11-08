# JAVA_10_05. Количество слов в файле — Тесты

## Компиляция и запуск

```bash
javac -encoding UTF-8 Main.java
printf 'hello world\n' > /tmp/text.txt
java Main /tmp/text.txt
```

Эталон:

```bash
javac -encoding UTF-8 Solution.java
java Solution /tmp/text.txt
```

## Проверка вывода

| Файл | Результат |
| --- | --- |
| `hello world` | `2\n` |
| `one two three` | `3\n` |
| `one\ntwo three\n\nfour` | `4\n` |
| пустой файл | `0\n` |
| `   ` (только пробелы) | `0\n` |

## Крайние случаи

- **Пустой файл** — 0.
- **Пустая строка внутри** — не добавляет слово.
- **Несколько пробелов** — не создают пустых слов.
- **Слова на разных строках** — считаются все.

## Автотесты

```bash
bash run_tests10_5.sh
```
