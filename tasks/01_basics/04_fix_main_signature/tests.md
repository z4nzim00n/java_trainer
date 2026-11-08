# JAVA_01_04. Неправильная сигнатура main — Тесты

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

## Проверка вывода

| Вход | Результат | Команда | Пояснение |
| --- | --- | --- | --- |
| `4` | `8\n` | `echo 4 \| java Main` | Удвоение положительного числа |
| `-3` | `-6\n` | `echo -3 \| java Main` | Удвоение отрицательного числа |
| `0` | `0\n` | `echo 0 \| java Main` | Ноль остаётся нулём |

## Пока ошибка не исправлена

При запуске ты увидишь:

```text
Error: Main method not found in class Main, please define the main method as:
   public static void main(String[] args)
```

или ошибку компиляции — в зависимости от того, что именно не так с сигнатурой.

## Автотесты

```bash
bash run_tests1_4.sh
```

Скрипт компилирует `Main.java` и сравнивает вывод побайтово.