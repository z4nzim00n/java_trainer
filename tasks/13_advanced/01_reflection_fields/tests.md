# JAVA_13_01. Рефлексия: поля класса — Тесты

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
| *(нет ввода)* | `age: int\nname: String\n` |

## Что проверяется

- Использованы именно объявленные поля класса `Person` (два поля, оба приватные).
- Вывод отсортирован по имени поля.
- Тип напечатан коротким именем: `int`, `String`.

## Автотесты

```bash
bash run_tests13_1.sh
```
