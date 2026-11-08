# Разбор задания

## Из чего состоит программа на Java

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

В Java весь код живёт внутри **классов**. Минимальная программа — это один класс с методом `main`:

| Элемент | Что означает |
| --- | --- |
| `public class Main` | Объявление класса с именем `Main`. Имя публичного класса **обязано** совпадать с именем файла: `Main.java` |
| `public static void main(String[] args)` | Точка входа: с этого метода JVM начинает выполнение. Сигнатура фиксирована, менять её нельзя |
| `String[] args` | Аргументы командной строки. В этой задаче не используются, но параметр обязан быть |
| `System.out.println(...)` | Печать строки в stdout **с переносом строки** в конце |
| `System.out.print(...)` | То же самое, но **без** переноса строки |

## Компиляция и запуск

Java — компилируемый язык, но компиляция двухступенчатая:

```bash
javac Main.java   # исходник -> байт-код Main.class
java Main         # JVM выполняет байт-код (без .class в имени!)
```

`javac` — компилятор, `java` — запуск. Частая ошибка новичка — писать `java Main.class` или `java Main.java` при обычном запуске: нужно просто `java Main`.

## println против print

Тесты сравнивают вывод побайтово. Разница в один невидимый символ `\n` — это проваленный тест:

- `System.out.println("Hello, Java!");` → `Hello, Java!\n`
- `System.out.print("Hello, Java!");` → `Hello, Java!`

В этой задаче нужен именно `println`.

## Частые ошибки

| Ошибка | Что происходит |
| --- | --- |
| `public class main` (с маленькой буквы) | Файл `Main.java` не компилируется: имя класса не совпадает с именем файла |
| `public void main(String[] args)` (без `static`) | Компилируется, но JVM не находит точку входа: `Main method not found` |
| `System.out.println("Hello, Java!")` без `;` | Ошибка компиляции: `';' expected` |
| `system.out.println` | Java чувствительна к регистру: `system` не существует |