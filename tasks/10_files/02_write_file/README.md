## JAVA_10_02. Записать файл

### Задание
| Java_10_02 ||
| ------ | ------- |
| **Темы:** | `Files.write`, чтение stdin до конца, `StandardCharsets`, аргументы `main`. |
| **Файл решения:** | Main.java |
| **Входные данные** | Текст в stdin; путь к файлу — первый аргумент |
| **Выходные данные** | Стандартный поток вывода (stdout) |

Напиши программу, которая:

1. получает путь к файлу первым аргументом командной строки;
2. читает **весь stdin** (возможно, несколько строк) и сохраняет его в файл;
3. выводит `Saved: <N> bytes`, где `N` — количество записанных байтов.

Строки нужно склеить через `\n` **без** лишнего перевода в конце. Читай так:

```java
Scanner sc = new Scanner(System.in);
StringBuilder sb = new StringBuilder();
while (sc.hasNextLine()) {
    sb.append(sc.nextLine());
    if (sc.hasNextLine()) {
        sb.append('\n');
    }
}
byte[] data = sb.toString().getBytes(StandardCharsets.UTF_8);
Files.write(Paths.get(args[0]), data);
System.out.println("Saved: " + data.length + " bytes");
```

### Примеры

Вход `hello` → файл содержит `hello`, вывод:

```text
Saved: 5 bytes
```

Вход `line1` и `line2` на двух строках → файл содержит `line1\nline2`, вывод:

```text
Saved: 11 bytes
```

### Как проверить

```bash
bash run_tests10_2.sh
```
