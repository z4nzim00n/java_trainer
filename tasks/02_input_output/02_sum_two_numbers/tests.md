# JAVA_02_02. Сумма двух чисел — Тесты

## Компиляция и запуск

```bash
javac -encoding UTF-8 Main.java
echo "2 3" | java Main
```

Эталон:

```bash
javac -encoding UTF-8 Solution.java && java Solution
```

## Проверка вывода

| Вход | Результат | Команда | Пояснение |
| --- | --- | --- | --- |
| `2 3` | `5\n` | `echo "2 3" \| java Main` | Числа в одной строке |
| `2\n3` | `5\n` | `printf '2\n3\n' \| java Main` | Числа на разных строках |
| `-4 4` | `0\n` | `echo "-4 4" \| java Main` | Сумма противоположных чисел |
| `10 20` | `30\n` | `echo "10 20" \| java Main` | Обычный случай |

## Автотесты

```bash
bash run_tests2_2.sh
```