# JAVA_08_04. Сортировка с Comparator — Тесты

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
| `5` + `bbb a cc dd e` | `a e cc dd bbb\n` | Длины 1,1,2,2,3; внутри длины — алфавит |
| `3` + `apple fig kiwi` | `fig kiwi apple\n` | Длины 3,4,5 |
| `4` + `bb aa cc dd` | `aa bb cc dd\n` | Одинаковая длина — алфавит |
| `1` + `java` | `java\n` | Один элемент |

## Крайние случаи

- **Одинаковая длина** — работает второе условие.
- **Разная длина** — первое условие.
- **Один элемент** — сортировать нечего.
- **Порядок ввода** — не влияет на результат.

## Автотесты

```bash
bash run_tests8_4.sh
```
