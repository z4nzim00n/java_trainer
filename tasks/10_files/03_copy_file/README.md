## JAVA_10_03. Копировать файл

### Задание
| Java_10_03 ||
| ------ | ------- |
| **Темы:** | `Files.copy`, `StandardCopyOption`, два аргумента командной строки. |
| **Файл решения:** | Main.java |
| **Входные данные** | Два аргумента: путь-источник и путь-назначение |
| **Выходные данные** | Стандартный поток вывода (stdout) |

Напиши программу, которая копирует файл:

- `args[0]` — откуда копировать;
- `args[1]` — куда копировать.

После успешного копирования выведи `Copied`. Если исходный файл не найден — `Error: file not found`.

```java
Files.copy(Paths.get(args[0]), Paths.get(args[1]),
        StandardCopyOption.REPLACE_EXISTING);
System.out.println("Copied");
```

`REPLACE_EXISTING` позволяет перезаписать уже существующий файл назначения. Без этой опции `Files.copy` бросит `FileAlreadyExistsException`.

### Примеры

```bash
java Main /tmp/source.txt /tmp/dest.txt
```

Вывод:

```text
Copied
```

Файл `/tmp/dest.txt` побайтово совпадает с `/tmp/source.txt`.

### Как проверить

```bash
bash run_tests10_3.sh
```
