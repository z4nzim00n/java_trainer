# JAVA_01_03. Пропущенные точки с запятой — Тесты

## Компиляция

```bash
javac -encoding UTF-8 Main.java
java Main
```

Эталон:

```bash
javac -encoding UTF-8 Solution.java
java Solution
```

Комментированная версия:

```bash
javac -encoding UTF-8 SolutionCommented.java
java SolutionCommented
```

## Проверка вывода

| Вход | Результат | Команда | Пояснение |
| --- | --- | --- | --- |
| `3` | `9\n` | `echo 3 \| java Main` | Квадрат положительного числа |
| `-5` | `25\n` | `echo -5 \| java Main` | Квадрат отрицательного числа положителен |
| `0` | `0\n` | `echo 0 \| java Main` | Ноль в квадрате — ноль |

## Пока ошибки не исправлены

Компилятор выдаст что-то вроде:

```text
Main.java:5: error: ';' expected
```

Это ожидаемо: задание и состоит в том, чтобы добавить пропущенные `;`.

## Автотесты

```bash
bash run_tests1_3.sh
```

Скрипт компилирует `Main.java` и сравнивает вывод побайтово.