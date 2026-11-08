# Разбор задания

## Приватность и рефлексия

Модификатор `private` — ограничение на уровне **компилятора и доступа кода**. Рефлексия работает в обход: она может читать и менять приватные поля. Это мощный инструмент, но и опасный — инкапсуляция перестаёт защищать.

```java
Field field = Secret.class.getDeclaredField("value");
field.setAccessible(true);
```

`getDeclaredField` находит поле, даже приватное. `setAccessible(true)` разрешает работу с ним.

## Чтение и запись

```java
field.set(instance, newValue);   // записать
Object current = field.get(instance);  // прочитать
```

`set` проверяет тип: в поле `String` нельзя записать `int` — будет `IllegalArgumentException`.

## Проверка доступа

| Ситуация | Результат |
| --- | --- |
| `getDeclaredField` без `setAccessible` | поле найдено |
| `field.get` / `field.set` без `setAccessible` | `IllegalAccessException` |
| `setAccessible(true)` | доступ разрешён |

## Ограничения модулей

С Java 9 поля JDK-классов защищены модульной системой: `setAccessible(true)` на `String.value` бросит `InaccessibleObjectException`. В учебном коде на собственных классах ограничений нет. В реальных проектах для таких случаев используют `--add-opens`.

## Где это встречается

- тестовые библиотеки, которые подставляют значения в приватные поля (Mockito);
- сериализация и ORM, заполняющие объекты без сеттеров;
- отладчики и консоли, показывающие внутреннее состояние.

## Частые ошибки

| Ошибка | Что происходит |
| --- | --- |
| `getField("value")` | `NoSuchFieldException`: поле приватное |
| Нет `setAccessible(true)` | `IllegalAccessException` |
| `get`/`set` перепутаны местами | Нужен объект-экземпляр, а не класс |
| Забыт `catch` | Ошибка компиляции: checked-исключения |
