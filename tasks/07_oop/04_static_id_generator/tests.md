# JAVA_07_04. Статический счётчик ID — Тесты

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
| `2` + `Alice Bob` | `1 Alice\n2 Bob\n` | Последовательные id |
| `1` + `Solo` | `1 Solo\n` | Первый id — 1 |
| `3` + `A B C` | `1 A\n2 B\n3 C\n` | Счётчик общий |
| `4` + `w x y z` | `1 w\n2 x\n3 y\n4 z\n` | Четыре объекта |

## Крайние случаи

- **Один объект** — id равен 1, а не 0.
- **Много объектов** — номера не повторяются.
- **Сброс между запусками** — каждый запуск JVM начинает с 1; тесты запускаются как отдельные процессы, поэтому ожидания стабильны.

## Автотесты

```bash
bash run_tests7_4.sh
```
