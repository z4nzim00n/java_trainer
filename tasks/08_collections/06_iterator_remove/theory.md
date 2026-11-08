# Разбор задания

## Почему for-each здесь не подходит

```java
for (int value : list) {
    if (value % 2 == 0) {
        list.remove(Integer.valueOf(value));  // ошибка!
    }
}
```

Такой код бросает `ConcurrentModificationException`: `for-each` внутри использует итератор, а список меняется напрямую. Итератор замечает, что структура изменилась, и защищается.

Технически `list.remove(value)` здесь ещё и перегружен: для `List<Integer>` вызов `remove(int)` удаляет **по индексу**, а `remove(Object)` — по значению. Чтобы удалить значение, нужен `Integer.valueOf(value)` или `remove((Integer) value)`.

## Iterator

```java
Iterator<Integer> it = list.iterator();
while (it.hasNext()) {
    int value = it.next();
    if (value % 2 == 0) {
        it.remove();
    }
}
```

- `hasNext()` — остались ли элементы;
- `next()` — вернуть следующий и перейти дальше;
- `remove()` — удалить элемент, который вернул **последний** `next()`.

Вызывать `remove()` без предшествующего `next()` нельзя — `IllegalStateException`.

## Аналог на Java 8

С Java 8 есть `removeIf`:

```java
list.removeIf(value -> value % 2 == 0);
```

Короче и делает то же самое. В этом задании нужен именно `Iterator` — чтобы понять механизм, на котором `removeIf` основан.

## Сборка вывода

```java
if (list.isEmpty()) {
    System.out.println("empty");
} else {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < list.size(); i++) {
        if (i > 0) sb.append(' ');
        sb.append(list.get(i));
    }
    System.out.println(sb);
}
```

## Частые ошибки

| Ошибка | Что происходит |
| --- | --- |
| `for-each` + `list.remove(...)` | `ConcurrentModificationException` |
| `list.remove(value)` | Для `Integer` может удалить по индексу |
| `it.remove()` без `next()` | `IllegalStateException` |
| Два `it.remove()` подряд | Второй вызов — `IllegalStateException` |
| `% 2 == 1` | Удаляются нечётные, а не чётные |
