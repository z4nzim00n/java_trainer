## JAVA_13_02. Рефлексия: вызов метода

### Задание
| Java_13_02 ||
| ------ | ------- |
| **Темы:** | `getMethod`, `Method.invoke`, параметры-примитивы, `ReflectiveOperationException`. |
| **Файл решения:** | Main.java |
| **Входные данные:** | Стандартный поток ввода (stdin) |
| **Выходные данные** | Стандартный поток вывода (stdout) |

Дан класс:

```java
class Calculator {
    public String greet(String name) {
        return "Hello, " + name;
    }

    public int square(int value) {
        return value * value;
    }
}
```

Считай команду и аргумент из одной строки:

- `greet <имя>` — вызови `greet` через рефлексию и выведи результат;
- `square <число>` — вызови `square` через рефлексию и выведи результат.

```java
Method method = Calculator.class.getMethod("square", int.class);
Object result = method.invoke(new Calculator(), 7);
System.out.println(result);   // 49
```

Аргумент `int.class` обязателен: `getMethod` ищет метод по точной сигнатуре, а `Integer.class` — это уже другой тип.

### Примеры

| Входные данные | Результат работы |
| ------ | ------ |
| greet Bob | Hello, Bob |
| square 7 | 49 |
| square 0 | 0 |

### Как проверить

```bash
bash run_tests13_2.sh
```
