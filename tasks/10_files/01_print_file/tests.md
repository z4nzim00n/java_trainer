# JAVA_10_01. Вывести содержимое файла — Тесты

## Компиляция и запуск

```bash
javac -encoding UTF-8 Main.java
printf 'line1\nline2\n' > /tmp/data.txt
java Main /tmp/data.txt
```

Эталон:

```bash
javac -encoding UTF-8 Solution.java
java Solution /tmp/data.txt
```

## Проверка вывода

| Файл | Результат |
| --- | --- |
| `line1\nline2\n` | `line1\nline2\n` |
| `hello` (без `\n`) | `hello` |
| пустой файл | ничего |
| несуществующий путь | `Error: file not found\n` |

## Крайние случаи

- **Файл без завершающего `\n`** — проверяет, что используется `print`.
- **Пустой файл** — вывод пустой.
- **Отсутствующий файл** — понятное сообщение вместо стека вызовов.
- **Кириллица** — проверяет `UTF-8`.

## Автотесты

```bash
bash run_tests10_1.sh
```
