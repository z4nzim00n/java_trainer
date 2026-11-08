## JAVA_13_01. Рефлексия: поля класса

### Задание
| Java_13_01 ||
| ------ | ------- |
| **Темы:** | `Class`, `getDeclaredFields()`, `Field`, `getType()`, сортировка. |
| **Файл решения:** | Main.java |
| **Входные данные:** | Не требуются |
| **Выходные данные** | Стандартный поток вывода (stdout) |

Дан класс:

```java
class Person {
    private String name;
    private int age;
}
```

Через рефлексию получи все объявленные поля класса `Person`, отсортируй их по имени и выведи по одному в формате `имя: тип`:

```text
age: int
name: String
```

```java
Field[] fields = Person.class.getDeclaredFields();
Arrays.sort(fields, new Comparator<Field>() {
    @Override
    public int compare(Field a, Field b) {
        return a.getName().compareTo(b.getName());
    }
});
for (Field field : fields) {
    System.out.println(field.getName() + ": " + field.getType().getSimpleName());
}
```

`getDeclaredFields()` возвращает и приватные поля тоже — в отличие от `getFields()`, который видит только публичные и унаследованные.

### Примеры

| Входные данные | Результат работы |
| ------ | ------ |
| *(нет ввода)* | `age: int`<br>`name: String` |

### Как проверить

```bash
bash run_tests13_1.sh
```
