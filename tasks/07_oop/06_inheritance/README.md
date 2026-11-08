## JAVA_07_06. Наследование и полиморфизм

### Задание
| Java_07_06 ||
| ------ | ------- |
| **Темы:** | Абстрактные классы, `extends`, `@Override`, полиморфизм, `super`. |
| **Файл решения:** | Main.java |
| **Входные данные:** | Стандартный поток ввода (stdin) |
| **Выходные данные** | Стандартный поток вывода (stdout) |

Опиши иерархию фигур в одном файле:

- `abstract class Shape` с абстрактным методом `double area();`
- `class Circle extends Shape` — радиус `double radius`, площадь `Math.PI * radius * radius`;
- `class Rectangle extends Shape` — ширина и высота, площадь `width * height`.

В `main` ввод начинается со слова:

- `circle` и одно вещественное число — радиус;
- `rect` и два вещественных числа — ширина и высота.

Создай объект через ссылку `Shape shape`, положи в неё нужную фигуру и выведи строку:

```text
<слово из ввода>: <площадь с двумя знаками>
```

Например: `circle: 12.57`. Используй `System.out.printf(Locale.US, ...)`.

```java
Shape shape;
if (kind.equals("circle")) {
    shape = new Circle(sc.nextDouble());
} else {
    shape = new Rectangle(sc.nextDouble(), sc.nextDouble());
}
System.out.printf(Locale.US, "%s: %.2f\n", kind, shape.area());
```

Гарантируется корректный ввод: `circle` или `rect` и неотрицательные числа.

### Примеры

| Входные данные | Результат работы |
| ------ | ------ |
| circle 2 | circle: 12.57 |
| rect 3 4 | rect: 12.00 |
| rect 2.5 4 | rect: 10.00 |

### Как проверить

```bash
bash run_tests7_6.sh
```
