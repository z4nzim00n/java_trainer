# JAVA_07_06. Наследование и полиморфизм — Тесты

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
| `circle 2` | `circle: 12.57\n` | π·4 = 12.566... |
| `rect 3 4` | `rect: 12.00\n` | 3·4 |
| `rect 2.5 4` | `rect: 10.00\n` | Дробные стороны |
| `circle 0` | `circle: 0.00\n` | Нулевой радиус |

## Крайние случаи

- **Круг и прямоугольник** — обе ветки полиморфного вызова.
- **Дробные значения** — нужен `nextDouble` и `Locale.US`.
- **Ноль** — площадь `0.00`, формат сохраняет два знака.
- **Слово `rect`** — ветка `else`; другого слова на входе не бывает по условию.

## Автотесты

```bash
bash run_tests7_6.sh
```
