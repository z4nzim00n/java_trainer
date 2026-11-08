## JAVA_10_01. Вывести содержимое файла

### Задание
| Java_10_01 ||
| ------ | ------- |
| **Темы:** | `Files.readAllBytes`, `Paths`, `StandardCharsets`, аргументы `main`. |
| **Файл решения:** | Main.java |
| **Входные данные:** | Путь к файлу — первый аргумент командной строки |
| **Выходные данные** | Стандартный поток вывода (stdout) |

Напиши программу, которая получает **путь к файлу** первым аргументом командной строки и выводит его содержимое в стандартный вывод **без изменений** — ровно те же байты, включая переносы строк.

```java
public static void main(String[] args) throws IOException {
    byte[] data = Files.readAllBytes(Paths.get(args[0]));
    System.out.print(new String(data, StandardCharsets.UTF_8));
}
```

Важно использовать `print`, а не `println`: иначе добавится лишний перевод строки.

Если файл не найден, выведи `Error: file not found` и заверши работу (ловим `IOException`).

### Примеры

Файл содержит:

```text
line1
line2
```

Результат работы — те же две строки:

```text
line1
line2
```

### Как проверить

```bash
bash run_tests10_1.sh
```
