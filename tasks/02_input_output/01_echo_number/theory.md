# Разбор задания

## Ввод в Java

В C ввод делается через `scanf`. В Java для консольного ввода используют класс `Scanner`:

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
```

Разберём по частям:

| Элемент | Смысл |
| --- | --- |
| `import java.util.Scanner;` | Подключение класса из стандартной библиотеки |
| `new Scanner(System.in)` | Создание объекта-читателя поверх стандартного ввода |
| `sc.nextInt()` | Прочитать следующее целое число |

`Scanner` — обычный объект. Его создают один раз и переиспользуют для всех чтений.

## Как Scanner находит число

`nextInt()` сначала **пропускает** пробелы, табы и переводы строк, затем читает цифры (и знак `-`). Поэтому неважно, как именно разделены числа:

```text
42
```

```text
   42
```

```text
42
```

Все три варианта дадут одно и то же.

## println и точность вывода

`System.out.println(n)` печатает число и добавляет `\n`. Тесты сравнивают байты, поэтому лишний пробел или отсутствие перевода строки — ошибка.

## Частые ошибки

| Ошибка | Симптом |
| --- | --- |
| Забыли `import java.util.Scanner;` | `cannot find symbol: class Scanner` |
| `new Scanner(System.out)` | Программа падает: `System.out` — поток вывода, из него нельзя читать |
| `sc.nextInt` без скобок | `cannot find symbol: variable nextInt` |
| `System.out.print(n)` | Вывод без `\n` — тест провалится (ожидается `42\n`) |

## Сравнение с C

| C | Java |
| --- | --- |
| `int n; scanf("%d", &n);` | `int n = sc.nextInt();` |
| `printf("%d", n);` | `System.out.print(n);` |
| `printf("%d\n", n);` | `System.out.println(n);` |