# JAVA_10_06. Сигнатура файла — Тесты

## Компиляция и запуск

```bash
javac -encoding UTF-8 Main.java
printf '\x89PNG\r\n' > /tmp/image.png
java Main /tmp/image.png
```

Эталон:

```bash
javac -encoding UTF-8 Solution.java
java Solution /tmp/image.png
```

## Проверка вывода

| Сигнатура | Результат |
| --- | --- |
| `\x89PNG` | `PNG\n` |
| `%PDF-1.4` | `PDF\n` |
| `PK\x03\x04` | `ZIP\n` |
| `hello` | `UNKNOWN\n` |
| пустой файл | `UNKNOWN\n` |

## Крайние случаи

- **Пустой файл** — длины меньше 4, ответ `UNKNOWN` без падения.
- **Короткий файл** (`PN`) — тоже `UNKNOWN`.
- **Байт `0x89`** — проверяет `& 0xFF`.
- **Текст с началом `PK`** но без `03 04` — `UNKNOWN`.

## Автотесты

```bash
bash run_tests10_6.sh
```
