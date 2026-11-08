# JAVA_10_03. Копировать файл — Тесты

## Компиляция и запуск

```bash
javac -encoding UTF-8 Main.java
printf 'alpha\nbeta\n' > /tmp/source.txt
java Main /tmp/source.txt /tmp/dest.txt
cmp /tmp/source.txt /tmp/dest.txt
```

Эталон:

```bash
javac -encoding UTF-8 Solution.java
java Solution /tmp/source.txt /tmp/dest2.txt
```

## Проверка вывода

| Условие | Вывод |
| --- | --- |
| файл существует | `Copied\n` |
| файла нет | `Error: file not found\n` |
| цель существует | перезаписывается, `Copied\n` |

## Крайние случаи

- **Повторный запуск** — цель уже есть, нужен `REPLACE_EXISTING`.
- **Пустой файл** — копируется пустой.
- **Многострочный файл** — содержимое совпадает побайтово.
- **Несуществующий источник** — сообщение об ошибке.

## Автотесты

```bash
bash run_tests10_3.sh
```
