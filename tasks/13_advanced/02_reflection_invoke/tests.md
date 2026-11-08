# JAVA_13_02. Рефлексия: вызов метода — Тесты

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

| Вход | Результат |
| --- | --- |
| `greet Bob` | `Hello, Bob\n` |
| `greet Alice` | `Hello, Alice\n` |
| `square 7` | `49\n` |
| `square 0` | `0\n` |
| `square 12` | `144\n` |
| *(EOF до первой строки)* | *(пусто)* |

## Крайние случаи

- **Пустой ввод** — программа завершается без вывода и без исключения.
- **Квадрат нуля** — `0`, а не пустая строка.
- **Имя с одним словом** — `greet Bob`; аргумент читается до пробела.

## Автотесты

```bash
bash run_tests13_2.sh
```
