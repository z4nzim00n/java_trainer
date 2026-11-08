# JAVA_02_04. Форматированный вывод — Тесты

## Компиляция и запуск

```bash
javac -encoding UTF-8 Main.java
echo "3.5 2" | java Main
```

Эталон:

```bash
javac -encoding UTF-8 Solution.java && java Solution
```

## Проверка вывода

| Вход | Результат | Команда | Пояснение |
| --- | --- | --- | --- |
| `3.5 2` | `Total: 7.00\n` | `echo "3.5 2" \| java Main` | Округление до двух знаков |
| `0.1 3` | `Total: 0.30\n` | `echo "0.1 3" \| java Main` | Погрешность double скрыта форматом |
| `10 1` | `Total: 10.00\n` | `echo "10 1" \| java Main` | Целое печатается как 10.00 |

## Автотесты

```bash
bash run_tests2_4.sh
```