# Разбор задания

## Зачем ArrayList

Массив `int[]` имеет фиксированную длину. `ArrayList` растёт по мере добавления элементов и умеет вставлять и удалять.

```java
List<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
int size = list.size();
int first = list.get(0);
```

| Операция | Метод | Сложность |
| --- | --- | --- |
| Добавить в конец | `add(x)` | O(1) амортизированно |
| Получить по индексу | `get(i)` | O(1) |
| Размер | `size()` | O(1) |
| Удалить по индексу | `remove(i)` | O(N) |

## Дженерики и обёртки

`ArrayList<int>` не компилируется: дженерики работают только с ссылочными типами. Для каждого примитива есть обёртка:

| Примитив | Обёртка |
| --- | --- |
| `int` | `Integer` |
| `double` | `Double` |
| `char` | `Character` |
| `boolean` | `Boolean` |

Автоупаковка:

```java
list.add(5);          // int -> Integer автоматически
int x = list.get(0);  // Integer -> int автоматически
```

## Интерфейс List

Переменную лучше объявлять через интерфейс:

```java
List<Integer> list = new ArrayList<>();
```

Тогда реализацию (`ArrayList`, `LinkedList`) можно заменить, не меняя остальной код.

## for-each

```java
int sum = 0;
for (int value : list) {
    sum += value;
}
```

Читается как «для каждого значения в list». Внутри используется итератор — про него будет отдельное задание.

## Сборка строки

```java
StringBuilder sb = new StringBuilder();
for (int i = 0; i < list.size(); i++) {
    if (i > 0) sb.append(' ');
    sb.append(list.get(i));
}
System.out.println(sb);
```

## Частые ошибки

| Ошибка | Что происходит |
| --- | --- |
| `new ArrayList<int>()` | Дженерики не принимают примитивы |
| `list.length` | У коллекций метод `size()` |
| `list[0]` | Коллекции не индексируются через `[]` |
| `list.get(n)` | Индексы от `0` до `size() - 1` |
| Сложение `Integer` без распаковки | Работает, но возможно `NullPointerException` для `null` |
