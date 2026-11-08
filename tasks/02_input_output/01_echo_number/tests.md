# JAVA_02_01. Эхо-число — Тесты

## Компиляция и запуск

```bash
javac -encoding UTF-8 Main.java
echo 42 | java Main
```

Эталон:

```bash
javac -encoding UTF-8 Solution.java && java Solution
```

## Проверка вывода

| Вход | Результат | Команда | Пояснение |
| --- | --- | --- | --- |
| `42` | `42\n` | `echo 42 \| java Main` | Положительное число |
| `-7` | `-7\n` | `echo -7 \| java Main` | Отрицательное число |
| `0` | `0\n` | `echo 0 \| java Main` | Ноль |
| `   15  ` | `15\n` | `printf '   15  ' \| java Main` | Пробелы до и после числа пропускаются |

## Как увидеть перевод строки

```bash
echo 42 | java Main | od -An -t x1
```

Ожидаемые байты: `34 32 0a` — символы `4`, `2` и `\n`.

## Автотесты

```bash
bash run_tests2_1.sh
```