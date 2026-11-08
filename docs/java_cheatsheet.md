# Шпаргалка по Java 8

Краткий справочник по темам тренажёра. Примеры рассчитаны на Java 8:
без `var`, `List.of`, `records` и switch-выражений.

---

## Структура программы

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
```

- Имя публичного класса совпадает с именем файла: `Main.java` → `class Main`.
- `main` должен быть `public static void` и принимать `String[] args`.
- `javac Main.java` → `Main.class`; `java Main` — запуск.
- В одном файле может быть только один `public` класс; остальные — package-private.

---

## Примитивы и типы

| Тип | Размер | Диапазон / значения | Литерал |
| --- | --- | --- | --- |
| `byte` | 8 бит | −128…127 | `(byte) 1` |
| `short` | 16 бит | −32768…32767 | `(short) 1` |
| `int` | 32 бита | ±2,1 млрд | `42` |
| `long` | 64 бита | ±9,2·10¹⁸ | `42L` |
| `float` | 32 бита | вещественное | `3.14f` |
| `double` | 64 бита | вещественное | `3.14` |
| `char` | 16 бит | Unicode-символ | `'A'` |
| `boolean` | — | `true` / `false` | `true` |

Размеры примитивов в Java **фиксированы** и не зависят от платформы.

Ссылочные типы: `String`, массивы, классы, интерфейсы. Значение по умолчанию
для поля-ссылки — `null`. Локальные переменные не инициализируются вообще.

```java
int a = 5;
long b = a;              // расширение int -> long
double c = 5;            // int -> double
int d = (int) 3.99;      // 3: дробная часть отбрасывается
```

---

## Операторы

| Оператор | Смысл | Пример |
| --- | --- | --- |
| `+ - * /` | арифметика | `7 / 2 == 3` |
| `%` | остаток | `7 % 2 == 1`, `-7 % 2 == -1` |
| `== !=` | сравнение | `a == b` |
| `< > <= >=` | порядок | `i < n` |
| `&& \|\| !` | логика (с сокращённым вычислением) | `a > 0 && b > 0` |
| `& \| ^` | побитовые операции | `mask & 0xFF` |
| `?:` | тернарный оператор | `x > 0 ? "да" : "нет"` |
| `++ --` | инкремент/декремент | `i++` возвращает старое значение |
| `+` для `String` | конкатенация | `"a" + 1` → `"a1"` |

### Целочисленное деление

Если оба операнда целые, дробная часть отбрасывается:

```java
int x = 7 / 2;          // 3
double y = 7 / 2.0;     // 3.5
double z = (a + b) / 2.0;
```

Переполнение `int` не бросает исключение — значение «заворачивается». Для
больших сумм бери `long`.

---

## Ввод и вывод

```java
import java.util.Scanner;
import java.util.Locale;

Scanner sc = new Scanner(System.in);
sc.useLocale(Locale.US);          // десятичная точка

int n = sc.nextInt();
double d = sc.nextDouble();
String word = sc.next();          // до пробела
sc.nextLine();                    // до конца строки (может быть пустой после nextInt)
String line = sc.nextLine();
```

```java
System.out.print("без перевода строки");
System.out.println("с переводом строки");
System.out.println();                       // пустая строка
System.out.printf(Locale.US, "%.2f%n", x);  // 2 знака после точки
System.out.println(a + " " + b);            // числа через пробел
```

Частая проблема: `nextInt()` не забирает `\n`. Если после него нужен
`nextLine()`, добавь пустой `sc.nextLine()`.

---

## Условия и циклы

```java
if (x > 0) {
    // ...
} else if (x == 0) {
    // ...
} else {
    // ...
}
```

```java
for (int i = 0; i < n; i++) { }      // i видна только внутри цикла
while (condition) { }
do { } while (condition);            // минимум одна итерация

for (int x : array) { }              // for-each, x — копия элемента
```

`break` выходит из ближайшего цикла, `continue` переходит к следующей итерации.

---

## Массивы

```java
int[] a = new int[5];                // 5 нулей
int[] b = {1, 2, 3};
int[][] m = new int[rows][cols];

a.length                             // поле, без скобок
a[0]                                 // индексы 0..length-1
Arrays.toString(a)                   // "[1, 2, 3]"
int[] copy = Arrays.copyOf(a, a.length);
```

- Размер фиксирован после создания.
- Выход за границу — `ArrayIndexOutOfBoundsException`.
- `int[] c = a;` копирует ссылку, а не массив.

---

## Строки

```java
String s = "Hello";
s.length()               // 5
s.charAt(1)              // 'e'
s.substring(1, 3)        // "el" (end не включается)
s.toUpperCase()          // "HELLO"
s.toLowerCase()          // "hello"
s.trim()                 // без пробелов по краям
s.isEmpty()              // true/false
s.contains("ell")
s.indexOf('l')
s.equals(other)          // сравнение содержимого
s.split("\\s+")          // деление по пробельным символам
String.join(" ", list)   // объединить через разделитель
```

`String` неизменяем: любой «изменяющий» метод возвращает новый объект.
`==` сравнивает ссылки, `equals` — содержимое.

Для сборки строки в цикле:

```java
StringBuilder sb = new StringBuilder();
sb.append("a").append(1);
sb.reverse();
String result = sb.toString();
```

---

## Классы и объекты

```java
class Point {
    private int x;
    private int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    void setX(int x) {
        this.x = x;
    }
}
```

- Конструктор называется как класс и не имеет возвращаемого типа.
- `this(...)` вызывает другой конструктор и стоит первой строкой.
- `static` — принадлежит классу, а не объекту.
- `private` поля + методы доступа = инкапсуляция.

### Наследование и полиморфизм

```java
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    double area() {
        return Math.PI * r * r;
    }
}

Shape s = new Circle(1.0);
System.out.println(s.area());   // вызов Circle.area
```

- Один класс-родитель (`extends`), много интерфейсов (`implements`).
- `abstract`-класс нельзя создать через `new`.
- `@Override` просит компилятор проверить, что метод действительно переопределяет.
- Если переопределяешь `equals`, переопредели и `hashCode`.

---

## Коллекции

```java
import java.util.*;

List<Integer> list = new ArrayList<>();
list.add(1);
list.add(2);
list.size();
list.get(0);
list.set(0, 10);
list.contains(2);
list.remove(Integer.valueOf(2));   // удалить значение, а не индекс

Map<String, Integer> map = new HashMap<>();
map.put("a", 1);
map.get("a");
map.getOrDefault("b", 0);
map.containsKey("a");

Set<String> set = new HashSet<>();
set.add("x");                      // дубликаты игнорируются
set.contains("x");

Deque<Integer> stack = new LinkedList<>();
stack.push(1);
stack.pop();
stack.peek();
```

| Интерфейс | Типичная реализация | Особенность |
| --- | --- | --- |
| `List` | `ArrayList` | индекс, порядок, дубликаты |
| `Map` | `HashMap` | ключ → значение, ключи уникальны |
| `Set` | `HashSet` | уникальные элементы |
| `Deque` | `LinkedList` / `ArrayDeque` | стек и очередь |
| `Queue` | `LinkedList` | FIFO |

- Generics работают только с классами: `List<Integer>`, не `List<int>`.
- `HashMap` не гарантирует порядок; `LinkedHashMap` — порядок вставки;
  `TreeMap` — сортировка по ключу.

### Сортировка

```java
Collections.sort(words);                        // естественный порядок
words.sort(new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
        return a.length() - b.length();
    }
});
```

Отрицательное значение — `a` раньше `b`, положительное — позже, `0` — равны.

### Удаление при обходе

```java
Iterator<Integer> it = list.iterator();
while (it.hasNext()) {
    if (it.next() % 2 == 0) {
        it.remove();            // безопасно
    }
}
```

Удалять коллекцию через `list.remove()` внутри for-each нельзя —
`ConcurrentModificationException`.

---

## Исключения

```java
try {
    int x = Integer.parseInt(text);
} catch (NumberFormatException e) {
    System.out.println("Invalid number");
} finally {
    System.out.println("Done");
}
```

| Тип | Проверяемое? | Пример |
| --- | --- | --- |
| `RuntimeException` и наследники | нет (unchecked) | `ArithmeticException`, `NullPointerException`, `NumberFormatException` |
| `Exception` (не RuntimeException) | да (checked) | `IOException`, `InterruptedException` |
| `Error` | нет | `OutOfMemoryError` |

- `throw new ...` — бросить исключение.
- `throws IOException` в сигнатуре — предупредить вызывающий код.
- `finally` выполняется почти всегда; исключение — `System.exit`.
- Своё checked-исключение: `class MyException extends Exception { }`.

```java
throw new IllegalArgumentException("bad value");
```

`try`-с-ресурсами (Java 7+):

```java
try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
    // reader закроется автоматически
}
```

---

## Файлы (`java.nio.file`)

```java
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

Path path = Paths.get("data.txt");

String text = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
Files.write(path, lines, StandardCharsets.UTF_8);

boolean exists = Files.exists(path);
Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
Files.deleteIfExists(path);

Path full = Paths.get("dir").resolve("data.txt");
```

- Все методы ввода-вывода бросают `IOException` (checked).
- Кодировку задавай явно: `StandardCharsets.UTF_8`.
- Байт ≠ символ: в UTF-8 кириллица занимает 2 байта, латиница — 1.

Чтение чисел из файла:

```java
Scanner sc = new Scanner(Paths.get("numbers.txt"), "UTF-8");
long sum = 0;
while (sc.hasNextInt()) {
    sum += sc.nextInt();
}
```

Сигнатура файла — первые байты:

```java
byte[] data = Files.readAllBytes(path);
if ((data[0] & 0xFF) == 0x89 && data[1] == 'P') {
    // PNG
}
```

`& 0xFF` превращает `byte` (−128…127) в значение 0…255.

---

## Многопоточность

```java
Thread thread = new Thread(new Runnable() {
    @Override
    public void run() {
        // код в новом потоке
    }
});
thread.start();      // запустить поток
try {
    thread.join();   // дождаться завершения
} catch (InterruptedException e) {
    Thread.currentThread().interrupt();
}
```

| Вызов | Результат |
| --- | --- |
| `start()` | новый поток, в нём вызывается `run()` |
| `run()` | обычный вызов в текущем потоке, без параллельности |
| `join()` | ждать завершения потока |
| `synchronized` | только один поток внутри блока/метода |

```java
class Counter {
    private int value;

    synchronized void increment() {
        value++;
    }
}
```

Пул потоков:

```java
ExecutorService pool = Executors.newFixedThreadPool(2);
Future<Long> future = pool.submit(new Callable<Long>() {
    @Override
    public Long call() {
        return 42L;
    }
});
long result = future.get();
pool.shutdown();
```

- Локальная переменная, захваченная анонимным классом, должна быть `final`
  или effectively final. Для результата из потока используют массив из одного
  элемента, `AtomicInteger` или `Future`.
- `join()` создаёт отношение «happens-before»: результат потока виден после
  `join()`.
- Гонка данных — результат зависит от планировщика; защита — `synchronized`,
  `Atomic*`, неизменяемые данные.

---

## Рефлексия

```java
import java.lang.reflect.*;

Class<?> type = Person.class;

Field[] fields = type.getDeclaredFields();       // все поля, включая private
Arrays.sort(fields, new Comparator<Field>() {
    @Override
    public int compare(Field a, Field b) {
        return a.getName().compareTo(b.getName());
    }
});

Field field = type.getDeclaredField("value");
field.setAccessible(true);                       // разрешить приватный доступ
field.set(instance, "new value");
Object current = field.get(instance);

Method method = type.getMethod("square", int.class);
Object result = method.invoke(instance, 7);      // вернёт Integer 49
```

| Что нужно | Метод |
| --- | --- |
| все поля класса | `getDeclaredFields()` |
| только публичные поля | `getFields()` |
| метод по сигнатуре | `getMethod("name", int.class)` |
| приватный метод | `getDeclaredMethod(...)` |
| разрешить доступ | `setAccessible(true)` |

Типичные исключения (`ReflectiveOperationException` объединяет их):

- `NoSuchFieldException`, `NoSuchMethodException` — не найдено;
- `IllegalAccessException` — нет доступа;
- `InvocationTargetException` — вызванный метод бросил исключение.

---

## Полезные мелочи

```java
Integer.parseInt("42")           // строка -> int
String.valueOf(42)               // число -> строка
Math.abs(x), Math.max(a, b), Math.min(a, b)
Math.round(3.6)                  // 4
(int) Math.round(3.6)
Character.isLetter(c), Character.isDigit(c)
Arrays.sort(array)
Collections.sort(list)
Collections.reverse(list)
```

- `printf`-форматы: `%d` — целое, `%s` — строка, `%f` — вещественное,
  `%.2f` — два знака, `%n` — перевод строки.
- Деление на ноль: `int` → `ArithmeticException`, `double` → `Infinity`/`NaN`.
- `String.format(Locale.US, "%.2f", x)` — форматирование без вывода.
