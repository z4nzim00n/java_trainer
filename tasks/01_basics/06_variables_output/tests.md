# JAVA_01_06. Переменные и типы — Тесты

## Компиляция и запуск

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
| (пусто) | пять строк с подписями | `java Main < /dev/null` | Ввод не нужен |

Точный ожидаемый вывод (символ `\n` — конец строки):

```text
int: 42\ndouble: 3.14\nboolean: true\nchar: A\nString: Hello\n
```

Посмотреть байты:

```bash
java Main < /dev/null | od -An -t x1
```

В конце должен быть байт `0a` — последняя строка тоже заканчивается переводом строки (его добавляет `println`).

## Частые проблемы

| Симптом | Причина |
| --- | --- |
| В выводе `int: 42.0` | Переменная объявлена как `double` вместо `int` |
| В выводе `char: 65` | Печатается код символа, а не символ: вероятно, используется `(int) c` |
| В выводе `String: A` вместо `Hello` | Перепутаны значения переменных |

## Автотесты

```bash
bash run_tests1_6.sh
```