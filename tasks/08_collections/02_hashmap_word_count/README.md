## JAVA_08_02. Частоты слов через HashMap

### Задание
| Java_08_02 ||
| ------ | ------- |
| **Темы:** | `HashMap`, `getOrDefault`, `keySet`, сортировка ключей. |
| **Файл решения:** | Main.java |
| **Входные данные:** | Стандартный поток ввода (stdin) |
| **Выходные данные** | Стандартный поток вывода (stdout) |

Считай `N`, затем `N` слов (каждое — одно слово). Посчитай, сколько раз встречается каждое слово, и выведи статистику: на каждой строке слово и его количество через пробел, **в алфавитном порядке слов**.

HashMap не хранит порядок ключей, поэтому для стабильного вывода ключи нужно отсортировать.

```java
Map<String, Integer> counts = new HashMap<>();
for (int i = 0; i < n; i++) {
    String word = sc.next();
    counts.put(word, counts.getOrDefault(word, 0) + 1);
}
List<String> keys = new ArrayList<>(counts.keySet());
Collections.sort(keys);
for (String key : keys) {
    System.out.println(key + " " + counts.get(key));
}
```

`getOrDefault(word, 0)` возвращает текущее значение или `0`, если слова ещё нет. Это заменяет проверку `containsKey`.

### Примеры

| Входные данные | Результат работы |
| ------ | ------ |
| 5<br>apple banana apple cherry banana | apple 2<br>banana 2<br>cherry 1 |
| 1<br>x | x 1 |
| 4<br>b a b a | a 2<br>b 2 |

### Как проверить

```bash
bash run_tests8_2.sh
```
