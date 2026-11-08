# JAVA_07_05. toString и equals — Тесты

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
| `Java 2024 Java 2024` | `Java (2024)\nequal\n` | Все поля совпали |
| `Java 2024 Go 2019` | `Java (2024)\nnot equal\n` | Разные названия и годы |
| `Java 2024 Java 2020` | `Java (2024)\nnot equal\n` | Год отличается |
| `Java 2024 Java 2024` | `Java (2024)\nequal\n` | Разные объекты, одинаковые данные |

## Крайние случаи

- **Одинаковые данные, разные объекты** — главный тест `equals`: `==` дал бы `false`.
- **Разный год при одинаковом названии** — сравнение всех полей.
- **Разные названия** — тоже `not equal`.
- **`null`** — корректный `equals` должен вернуть `false`, а не упасть. В автотестах через стандартный ввод `null` не создать, но проверка `instanceof` обязательна.

## Автотесты

```bash
bash run_tests7_5.sh
```
