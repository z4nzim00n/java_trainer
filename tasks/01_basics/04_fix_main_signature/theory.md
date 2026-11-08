# Разбор задания

## Точка входа в Java

JVM начинает выполнение программы с метода, у которого сигнатура **ровно** такая:

```java
public static void main(String[] args)
```

Каждое слово обязательно:

| Часть | Почему нужна |
| --- | --- |
| `public` | JVM должна иметь доступ к методу извне класса |
| `static` | Метод вызывается до создания объекта класса |
| `void` | Ничего не возвращает |
| `main` | Имя фиксировано, регистр важен: `Main` — другой метод |
| `String[] args` | Аргументы командной строки; тип и массив обязательны |

## Что будет, если сигнатура неверная

| Код | Что произойдёт |
| --- | --- |
| `public static void Main()` | Компилируется, но при запуске: `Main method not found in class Main` |
| `public void main(String[] args)` (без `static`) | Ошибка: `non-static method main cannot be referenced from a static context` |
| `public static void main()` (без параметра) | Компилируется, но точка входа не найдена |
| `static void main(String[] args)` (без `public`) | Java 8: ошибка доступа; точка входа должна быть `public` |

## Как выглядит ошибка запуска

```text
Error: Main method not found in class Main,
please define the main method as:
   public static void main(String[] args)
```

Сообщение прямо подсказывает нужную сигнатуру.

## Почему `String[] args` обязателен

Через него в программу передаются аргументы командной строки:

```bash
java Main привет мир
```

Внутри `args` будет `["привет", "мир"]`. В этой задаче аргументы не используются, но параметр обязан присутствовать — это часть контракта JVM.

## Сравнение с C

В C точка входа — `int main(int argc, char **argv)`. В Java роль `argc` играет `args.length`, а роль `argv` — сам массив `String[] args`. Возвращаемое значение `int` в Java не нужно: код завершения задаётся через `System.exit(code)`.