# JAVA_12_05. Циклический сдвиг массива — Тесты

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
| `5 2` + `1 2 3 4 5` | `3 4 5 1 2\n` |
| `4 0` + `1 2 3 4` | `1 2 3 4\n` |
| `3 4` + `7 8 9` | `8 9 7\n` |
| `1 5` + `42` | `42\n` |
| `5 7` + `1 2 3 4 5` | `3 4 5 1 2\n` |

## Крайние случаи

- **K = 0** — без изменений.
- **K кратно N** — массив возвращается в исходное состояние.
- **K > N** — нормализация остатком.
- **N = 1** — сдвиг ничего не меняет.

## Автотесты

```bash
bash run_tests12_5.sh
```
