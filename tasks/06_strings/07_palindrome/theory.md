# Разбор задания

## Почему == не работает для строк

`==` сравнивает **ссылки** (тот ли это объект в памяти), а `equals` — **содержимое**:

```java
String a = new String("abc");
String b = new String("abc");
a == b        // false: разные объекты
a.equals(b)   // true: одинаковое содержимое
```

Строки-литералы могут кэшироваться, поэтому `==` иногда «случайно» даёт `true`. Полагаться на это нельзя: для содержимого всегда `equals`.

## Фильтрация

```java
if (Character.isLetterOrDigit(c)) {
    clean.append(Character.toLowerCase(c));
}
```

Так `A man a plan a canal Panama` превращается в `amanaplanacanalpanama`, а `Level` — в `level`.

## Сравнение с разворотом

```java
String s = clean.toString();
boolean ok = s.equals(new StringBuilder(s).reverse().toString());
```

`StringBuilder(s).reverse()` возвращает развёрнутую копию, `toString()` — строку, `equals` сравнивает содержимое.

## Альтернатива: два указателя

Без создания развёрнутой строки:

```java
int i = 0;
int j = s.length() - 1;
boolean ok = true;
while (i < j) {
    if (s.charAt(i) != s.charAt(j)) { ok = false; break; }
    i++;
    j--;
}
```

Это O(1) дополнительной памяти. Вариант с `StringBuilder` проще читается и для учебной задачи вполне подходит.

## Пустая строка

Пустая строка формально палиндром (читается одинаково в обе стороны). Фильтрация может превратить строку из одних знаков в пустую — по тем же правилам это `true`.

## Частые ошибки

| Ошибка | Что происходит |
| --- | --- |
| `s == reversed` | Сравниваются ссылки, результат непредсказуем |
| `equalsIgnoreCase` без фильтрации | Пробелы и запятые мешают |
| Забыть `toLowerCase` | `Level` даст `false` |
| Сравнивать с исходной строкой | Нужна отфильтрованная версия |
| `isLetter` вместо `isLetterOrDigit` | Цифры выпадают: `12321` даст `true` случайно, но логика неверна |
