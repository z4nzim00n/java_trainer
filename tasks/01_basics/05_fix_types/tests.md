# JAVA_01_05. Исправление типов — Тесты

## Компиляция

```bash
javac -encoding UTF-8 Main.java
java Main
```

Эталон и комментированная версия:

```bash
javac -encoding UTF-8 Solution.java && java Solution
javac -encoding UTF-8 SolutionCommented.java && java SolutionCommented
```

## Проверка вывода

| Вход | Результат | Команда | Пояснение |
| --- | --- | --- | --- |
| `2 3.5` | `5.5\n` | `echo 2 3.5 \| java Main` | Сумма int и double — double |
| `0 0.0` | `0.0\n` | `echo 0 0.0 \| java Main` | println печатает `0.0`, а не `0` |
| `-1 2.5` | `1.5\n` | `echo -1 2.5 \| java Main` | Отрицательный int + положительный double |

> Тесты подают дробные числа с точкой. Без `sc.useLocale(Locale.US)` на русской системе `nextDouble()` выбросит `InputMismatchException`.

## Пока ошибки не исправлены

Компилятор сообщит о несовместимых типах:

```text
error: incompatible types: possible lossy conversion from double to int
error: incompatible types: int cannot be converted to boolean
error: incompatible types: char cannot be converted to String
```

## Автотесты

```bash
bash run_tests1_5.sh
```