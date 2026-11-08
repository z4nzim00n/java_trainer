# JAVA_02_03. Чтение строки целиком — Тесты

## Компиляция и запуск

```bash
javac -encoding UTF-8 Main.java
printf 'Hello world\n' | java Main
```

Эталон:

```bash
javac -encoding UTF-8 Solution.java && java Solution
```

## Проверка вывода

| Вход | Результат | Команда | Пояснение |
| --- | --- | --- | --- |
| `Hello world\n` | `Hello world\n` | `printf 'Hello world\n' \| java Main` | Строка с пробелом |
| `  spaced  \n` | `  spaced  \n` | `printf '  spaced  \n' \| java Main` | Крайние пробелы сохраняются |
| `a\n` | `a\n` | `printf 'a\n' \| java Main` | Один символ |
| `Hello world` (без `\n`) | `Hello world\n` | `printf 'Hello world' \| java Main` | Ввод без завершающего перевода строки |

## Автотесты

```bash
bash run_tests2_3.sh
```