# JAVA_09_04. Блок finally — Тесты

## Компиляция

```bash
javac -encoding UTF-8 Main.java
java Main
```

Эталон:

```bash
javac -encoding UTF-8 Solution.java && java Solution
javac -encoding UTF-8 SolutionCommented.java && java SolutionCommented
```

## Проверка вывода

| Вход | Результат | Пояснение |
| --- | --- | --- |
| `10 2` | `5\nDone\n` | Успех, затем finally |
| `5 0` | `Error: division by zero\nDone\n` | Ошибка, затем finally |
| `7 2` | `3\nDone\n` | Целочисленное деление |
| `-8 2` | `-4\nDone\n` | Отрицательное число |

## Крайние случаи

- **Делитель 0** — исключение перехвачено, `finally` выполнен.
- **Нормальное деление** — `finally` тоже выполнен.
- **Порядок строк** — `Done` всегда последняя.

## Автотесты

```bash
bash run_tests9_4.sh
```
