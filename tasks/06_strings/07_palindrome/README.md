## JAVA_06_07. Палиндром

### Задание
| Java_06_07 ||
| ------ | ------- |
| **Темы:** | `StringBuilder`, `Character`, `equals`, посимвольная обработка. |
| **Файл решения:** | Main.java |
| **Входные данные:** | Стандартный поток ввода (stdin) |
| **Выходные данные:** | Стандартный поток вывода (stdout) |

Палиндром — строка, которая читается одинаково слева направо и справа налево. Считай одну строку и выведи `true`, если она является палиндромом, иначе `false`.

Правила сравнения:

- регистр букв не важен (`Level` — палиндром);
- пробелы и знаки препинания игнорируются.

Порядок действий: отфильтровать буквы и цифры, привести к нижнему регистру, сравнить с разворотом.

```java
StringBuilder clean = new StringBuilder();
for (int i = 0; i < line.length(); i++) {
    char c = line.charAt(i);
    if (Character.isLetterOrDigit(c)) {
        clean.append(Character.toLowerCase(c));
    }
}
String s = clean.toString();
boolean palindrome = s.equals(new StringBuilder(s).reverse().toString());
System.out.println(palindrome);
```

Обрати внимание: строки сравниваются через `equals`, а не через `==`.

### Примеры

| Входные данные | Результат работы |
| ------ | ------ |
| Level | true |
| A man a plan a canal Panama | true |
| hello | false |
| 12321 | true |

### Как проверить

```bash
bash run_tests6_7.sh
```
