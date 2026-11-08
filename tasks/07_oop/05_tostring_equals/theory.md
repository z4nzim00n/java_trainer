# Разбор задания

## Методы Object

Любой класс в Java неявно наследует `Object`. У него есть методы, которые полезно переопределять:

| Метод | Что делает по умолчанию |
| --- | --- |
| `toString()` | возвращает имя класса и хэш, например `Book@1b6d3586` |
| `equals(Object)` | сравнивает ссылки (как `==`) |
| `hashCode()` | числовой хэш объекта |

`println(book)` автоматически вызывает `toString()`. Конкатенация `"" + book` — тоже.

## Переопределение toString

```java
@Override
public String toString() {
    return title + " (" + year + ")";
}
```

`@Override` — аннотация-проверка: если сигнатура не совпала с методом предка, компилятор выдаст ошибку. Это защищает от опечаток.

## Переопределение equals

```java
@Override
public boolean equals(Object other) {
    if (this == other) return true;
    if (!(other instanceof Book)) return false;
    Book b = (Book) other;
    return year == b.year && title.equals(b.title);
}
```

Разбор:

1. `this == other` — тот же объект, сразу `true`.
2. `instanceof` — `null` даёт `false`, объект другого типа тоже.
3. Приведение к `Book`.
4. Сравнение полей. Строки — через `equals`, числа — через `==`.

## Контракт equals и hashCode

Если переопределяешь `equals`, нужно переопределить и `hashCode`, чтобы равные объекты имели одинаковый хэш. Иначе объекты будут вести себя странно в `HashMap` и `HashSet` (раздел коллекций). Минимальная реализация:

```java
@Override
public int hashCode() {
    return 31 * title.hashCode() + year;
}
```

В этом задании `hashCode` не проверяется автотестами, но в эталонном решении он есть — как правильная привычка.

## equals против ==

```java
b1 == b2          // те же ли объекты
b1.equals(b2)     // одинаковое ли содержимое
```

Для `String` внутри `equals` тоже нужен `equals`, а не `==`.

## Частые ошибки

| Ошибка | Что происходит |
| --- | --- |
| `equals(Book other)` | Это перегрузка, а не переопределение; `Object.equals` не затронут |
| Забыть `instanceof` | `ClassCastException` на чужом объекте |
| `title == b.title` | Сравнение ссылок, а не содержимого |
| `return title.equals(b.title) && year == b.year` без null-проверки | `null` даёт `NullPointerException` |
| Нет `hashCode` | Контракт нарушен, коллекции будут работать неверно |
