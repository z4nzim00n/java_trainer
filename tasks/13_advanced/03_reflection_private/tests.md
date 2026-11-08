# JAVA_13_03. Рефлексия: приватное поле — Тесты

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
| `secret42` | `Value: secret42\n` |
| `hello world` | `Value: hello world\n` |
| *(пустая строка)* | `Value: \n` |
| *(EOF до первой строки)* | `Value: \n` |

## Что проверяется

- Строка сохраняется именно в приватное поле `value` через рефлексию.
- Вывод начинается с `Value: ` и содержит исходную строку без изменений.
- Пустой ввод — пустое значение после `Value: `, без исключения.

## Автотесты

```bash
bash run_tests13_3.sh
```
