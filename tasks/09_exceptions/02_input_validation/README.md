## JAVA_09_02. Проверка ввода

### Задание
| Java_09_02 ||
| ------ | ------- |
| **Темы:** | `Integer.parseInt`, `NumberFormatException`, проверка на границе системы. |
| **Файл решения:** | Main.java |
| **Входные данные:** | Стандартный поток ввода (stdin) |
| **Выходные данные** | Стандартный поток вывода (stdout) |

Считай одну строку. Если она содержит корректное целое число, выведи это число (без изменений). Иначе выведи

```text
Invalid number
```

Разбор строки делай через `Integer.parseInt` внутри `try`/`catch`:

```java
String line = sc.nextLine().trim();
try {
    int value = Integer.parseInt(line);
    System.out.println(value);
} catch (NumberFormatException e) {
    System.out.println("Invalid number");
}
```

`parseInt` бросает `NumberFormatException`, если строка пустая, содержит буквы, дробную точку или не помещается в `int`.

### Примеры

| Входные данные | Результат работы |
| ------ | ------ |
| 42 | 42 |
| abc | Invalid number |
| -7 | -7 |
| 3.14 | Invalid number |

### Как проверить

```bash
bash run_tests9_2.sh
```
