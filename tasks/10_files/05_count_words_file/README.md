## JAVA_10_05. Количество слов в файле

### Задание
| Java_10_05 ||
| ------ | ------- |
| **Темы:** | `Files.readAllLines`, обработка строк, `split("\\s+")`. |
| **Файл решения:** | Main.java |
| **Входные данные** | Путь к файлу — первый аргумент командной строки |
| **Выходные данные** | Стандартный поток вывода (stdout) |

Подсчитай количество слов в текстовом файле. Слова разделены пробелами и/или переносами строк; пустые строки слов не добавляют.

```java
List<String> lines = Files.readAllLines(Paths.get(args[0]), StandardCharsets.UTF_8);
int count = 0;
for (String line : lines) {
    line = line.trim();
    if (!line.isEmpty()) {
        count += line.split("\\s+").length;
    }
}
System.out.println(count);
```

Пустой файл содержит `0` слов.

### Примеры

| Содержимое файла | Результат работы |
| ------ | ------ |
| `hello world` | 2 |
| `one two three` | 3 |
| (пустой файл) | 0 |

### Как проверить

```bash
bash run_tests10_5.sh
```
