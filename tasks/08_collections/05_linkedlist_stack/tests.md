# JAVA_08_05. Стек на LinkedList — Тесты

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
| `4` + `push 1 push 2 pop size` | `2\n1\n` | pop вернул 2, остался 1 |
| `3` + `peek push 5 peek` | `empty\n5\n` | peek на пустом, затем 5 |
| `2` + `push 7 pop` | `7\n` | Один элемент |
| `1` + `size` | `0\n` | Пустой стек |
| `3` + `push 1 push 2 size` | `2\n` | Размер после двух push |

## Крайние случаи

- **Операции на пустом стеке** — печатается `empty`, без исключений.
- **Порядок LIFO** — последний добавленный снимается первым.
- **`size` на пустом** — ноль.
- **Много команд** — состояние сохраняется между ними.

## Автотесты

```bash
bash run_tests8_5.sh
```
