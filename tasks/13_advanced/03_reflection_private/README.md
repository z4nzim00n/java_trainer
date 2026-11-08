## JAVA_13_03. Рефлексия: приватное поле

### Задание
| Java_13_03 ||
| ------ | ------- |
| **Темы:** | `getDeclaredField`, `setAccessible`, `Field.set`, `Field.get`. |
| **Файл решения:** | Main.java |
| **Входные данные:** | Стандартный поток ввода (stdin) |
| **Выходные данные** | Стандартный поток вывода (stdout) |

Дан класс с приватным полем:

```java
class Secret {
    private String value;
}
```

Считай строку, запиши её в поле `value` **через рефлексию** (обычный доступ запрещён модификатором `private`) и выведи:

```text
Value: <строка>
```

```java
Field field = Secret.class.getDeclaredField("value");
field.setAccessible(true);
field.set(secret, input);
System.out.println("Value: " + field.get(secret));
```

`setAccessible(true)` отключает проверку доступа для этого поля. Без него `set` и `get` бросят `IllegalAccessException`.

### Примеры

| Входные данные | Результат работы |
| ------ | ------ |
| secret42 | Value: secret42 |
| hello world | Value: hello world |
| *(пустая строка)* | Value: |

### Как проверить

```bash
bash run_tests13_3.sh
```
