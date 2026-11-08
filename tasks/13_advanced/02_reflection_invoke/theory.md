# Разбор задания

## Поиск метода

```java
Method method = Calculator.class.getMethod("square", int.class);
```

`getMethod(имя, типы...)` ищет **публичный** метод, включая унаследованные. Типы параметров задаются классами: `String.class`, `int.class`, `int[].class`. Перегрузка разрешается именно по ним.

| Метод | Что ищет |
| --- | --- |
| `getMethod` | публичный, включая унаследованные |
| `getDeclaredMethod` | объявленный в этом классе, любого уровня доступа |

## Вызов

```java
Object result = method.invoke(instance, arguments);
```

Первый аргумент — объект, у которого вызывается метод (для `static` можно передать `null`). Дальше идут аргументы метода. Возвращаемое значение всегда `Object`:

- `String` остаётся `String`;
- `int` упаковывается в `Integer`;
- `void` даёт `null`.

`println` печатает `Integer` без лишних кавычек, поэтому `49` выглядит как обычное число.

## Автоупаковка аргументов

`invoke` принимает `Object...`. Число `7` автоматически упаковывается в `Integer`, и рефлексия распаковывает его обратно в `int`. Для примитивов это работает прозрачно.

## Исключения

`invoke` объявляет несколько проверяемых исключений:

| Исключение | Причина |
| --- | --- |
| `NoSuchMethodException` | метод не найден по имени и сигнатуре |
| `IllegalAccessException` | нет доступа к методу |
| `InvocationTargetException` | сам вызванный метод бросил исключение |

Все три — подклассы `ReflectiveOperationException` (Java 7+), поэтому достаточно одного `catch`:

```java
try {
    // ...
} catch (ReflectiveOperationException e) {
    System.out.println("Error: " + e.getClass().getSimpleName());
}
```

## Разбор строки

`sc.nextLine().trim().split("\\s+")` делит строку по пробелам. Первый элемент — команда, второй — аргумент. Пустую строку и отсутствие ввода нужно обработать отдельно, иначе `parts[0]` бросит `ArrayIndexOutOfBoundsException`.

## Частые ошибки

| Ошибка | Что происходит |
| --- | --- |
| `getMethod("square", Integer.class)` | `NoSuchMethodException`: у метода параметр `int` |
| Забыт объект в `invoke` | Ошибка компиляции или неверный вызов |
| `catch (Exception e)` без причины | Работает, но скрывает детали |
| Нет проверки пустого ввода | `ArrayIndexOutOfBoundsException` |
