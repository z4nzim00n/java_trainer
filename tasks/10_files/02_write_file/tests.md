# JAVA_10_02. Записать файл — Тесты

## Компиляция и запуск

```bash
javac -encoding UTF-8 Main.java
echo "hello" | java Main /tmp/out.txt
cat /tmp/out.txt
```

Эталон:

```bash
javac -encoding UTF-8 Solution.java
echo "hello" | java Solution /tmp/out.txt
```

## Проверка вывода

| Вход | Файл | Вывод |
| --- | --- | --- |
| `hello` | `hello` | `Saved: 5 bytes\n` |
| две строки `line1`, `line2` | `line1\nline2` | `Saved: 11 bytes\n` |
| пустая строка | пустой файл | `Saved: 0 bytes\n` |
| `Привет` | `Привет` в UTF-8 | `Saved: 12 bytes\n` |

## Крайние случаи

- **Пустой ввод** — файл пустой, 0 байтов.
- **Несколько строк** — переводы только между строками.
- **Кириллица** — длина в байтах больше длины в символах.
- **Существующий файл** — перезаписывается.

## Автотесты

```bash
bash run_tests10_2.sh
```
