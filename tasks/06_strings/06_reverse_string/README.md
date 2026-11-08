## JAVA_06_06. Развернуть строку

### Задание
| Java_06_06 ||
| ------ | ------- |
| **Темы:** | `StringBuilder`, `reverse()`, неизменяемость `String`. |
| **Файл решения:** | Main.java |
| **Входные данные:** | Стандартный поток ввода (stdin) |
| **Выходные данные:** | Стандартный поток вывода (stdout) |

Считай одну строку и выведи её **в обратном порядке** символов с переносом строки в конце.

У `String` нет метода `reverse()`, потому что строки неизменяемы. Зато он есть у `StringBuilder` — изменяемого «соседа»:

```java
String line = sc.nextLine();
String reversed = new StringBuilder(line).reverse().toString();
System.out.println(reversed);
```

`new StringBuilder(line)` создаёт изменяемую копию, `reverse()` переворачивает её на месте, `toString()` возвращает обычную строку.

### Примеры

| Входные данные | Результат работы |
| ------ | ------ |
| hello | olleh |
| Java | avaJ |
| 12345 | 54321 |

### Как проверить

```bash
bash run_tests6_6.sh
```
